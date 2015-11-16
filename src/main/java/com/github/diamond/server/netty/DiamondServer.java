/**        
 * Copyright (c) 2013 by 苏州科大国创信息技术有限公司.    
 */    
package com.github.diamond.server.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create on @2013-8-24 @上午10:03:59 
 * @author bsli@ustcinfo.com
 */
public class DiamondServer  {
	
	private  final Logger logger = LoggerFactory.getLogger(DiamondServer.class);
	
	private int port = 8283;
	
	private EventLoopGroup bossGroup = new NioEventLoopGroup(1);
	
	private EventLoopGroup workerGroup = new NioEventLoopGroup();
	
	private DiamondServerHandler serverHandler = new DiamondServerHandler();
	private static DiamondServer diamondServer =null ; 
	private ServerBootstrap b = null ;
	private DiamondServer(){
		
		
	}
	public static DiamondServer getInstance(){
		if(diamondServer == null){
			synchronized (DiamondServer.class) {
				diamondServer = new DiamondServer();
			}
		}
		return diamondServer;
	}
	public static void main(String[] args) throws Exception {
		DiamondServer s = new DiamondServer();
		s.start();
	}
	
	public void start() throws Exception {
        b = new ServerBootstrap();
        b.group(bossGroup, workerGroup)
        	.channel(NioServerSocketChannel.class)
        	.option(ChannelOption.SO_BACKLOG, 1024)
        	.option(ChannelOption.SO_REUSEADDR, true)
        	.childHandler(new DiamondServerInitializer(serverHandler));
        b.bind("0.0.0.0", port).sync().channel();
        logger.info(" start Diamond Netty Server, post={}", port);
	}
	public void stop() {
		if(bossGroup != null){
			bossGroup.shutdownGracefully();
			bossGroup = null ;
		}
		
		if(workerGroup != null){
			workerGroup.shutdownGracefully();
			workerGroup = null ;
		}
		b= null ;
        logger.info("stop Diamond Netty Server, post={}", port);
	}
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public DiamondServerHandler getServerHandler() {
		return serverHandler;
	}

	public void setServerHandler(DiamondServerHandler serverHandler) {
		this.serverHandler = serverHandler;
	}
}
