/**        
 * Copyright (c) 2013 by 苏州科大国创信息技术有限公司.    
 */    
package com.github.diamond.server.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Create on @2013-8-24 @上午10:05:25 
 * @author bsli@ustcinfo.com
 */
@Sharable
public class DiamondServerHandler extends SimpleChannelInboundHandler<String> {
	
	public static ConcurrentHashMap<String /*projcode+profile*/, List<ClientInfo> /*client address*/> clients = 
			new ConcurrentHashMap<String, List<ClientInfo>>();
	
	private ConcurrentHashMap<String /*client address*/, ChannelHandlerContext> channels = 
			new ConcurrentHashMap<String, ChannelHandlerContext>();

    private static final Logger logger = LoggerFactory.getLogger(DiamondServerHandler.class);
    
    private final Charset charset = Charset.forName("UTF-8");
    
    
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
    	logger.info(ctx.channel().remoteAddress() + " 连接到服务器。");
    }
    
    @Override
    public void channelRead0(ChannelHandlerContext ctx, String request) throws Exception {
    	String config;
        if (request != null && request.startsWith("superdiamond")) {
        	String[] params = request.split(",");
        	
        	List<ClientInfo> addrs = clients.get(params[1] + "$$" + params[2]);
        	if(addrs == null) {
        		addrs = new ArrayList<ClientInfo>();
        	}
        	ClientInfo clientInfo = new ClientInfo(ctx.channel().remoteAddress().toString(), new Date());
        	addrs.add(clientInfo);
        	clients.put(params[1] + "$$" + params[2], addrs);
        	channels.put(ctx.channel().remoteAddress().toString(), ctx);
        	String paramsstr = "";
        	config =  "#version = 1.1 \r\n#procode = "+params[1]+"\r\n#profile="+params[2]+"\r\n"+paramsstr;
        } else {
        	config = "";
        }

        sendMessage(ctx, config);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    	ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
    
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
    	super.channelInactive(ctx);
    	
    	String address = ctx.channel().remoteAddress().toString();
    	channels.remove(address);
    	
    	for(List<ClientInfo> infos : clients.values()) {
    		for(ClientInfo client : infos) {
    			if(address.equals(client.getAddress())) {
    				infos.remove(client);
    				break;
    			}
    		}
    	}
    	
    	logger.info(ctx.channel().remoteAddress() + " 断开连接。");
    }
    
    /**
     * 向服务端推送配置数据。
     * 
     * @param projCode
     * @param profile
     * @param config
     */
    public void pushConfig(String projCode, String profile, final String config) {
    	List<ClientInfo> addrs = clients.get(projCode + "$$" + profile);
    	if(addrs != null) {
    		for(ClientInfo client : addrs) {
    			ChannelHandlerContext ctx = channels.get(client.getAddress());
    			if(ctx != null) {
    				sendMessage(ctx, config);
    			}
    		}
    	}
    }
    
    private void sendMessage(ChannelHandlerContext ctx, String config) {
    	byte[] bytes = config.getBytes(charset);
    	ByteBuf message = Unpooled.buffer(4 + bytes.length);
        message.writeInt(bytes.length);
        message.writeBytes(bytes);
        ctx.writeAndFlush(message);
	}
    
    public static class ClientInfo {
    	private String address;
    	private Date connectTime;
    	
    	public ClientInfo(String address, Date connectTime) {
			this.address = address;
			this.connectTime = connectTime;
		}
    	
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getConnectTime() {
			return connectTime;
		}
		public void setConnectTime(Date connectTime) {
			this.connectTime = connectTime;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((address == null) ? 0 : address.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ClientInfo other = (ClientInfo) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			return true;
		}
    }
}