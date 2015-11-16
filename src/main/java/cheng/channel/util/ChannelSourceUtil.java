package cheng.channel.util;

import cheng.channel.vo.RegisterSourceVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cheng on 2015/3/17.
 */
public class ChannelSourceUtil {
    private static Map<Integer,RegisterSourceVO> data = new HashMap<Integer,RegisterSourceVO>();
    private static boolean isinit = false ;
    public static boolean isinit(){
    	return  isinit ;
    }
    public static void init(List<RegisterSourceVO> list){
    	if(data.isEmpty()){
    		if(list==null || list.size()==0){
    			return ;
    		}
    		for(int i=0;i<list.size();i++){
    			data.put(Integer.valueOf(list.get(i).getRegistersource()), list.get(i));
    		}
    		isinit = true ;
    	}
    }
    
    public static RegisterSourceVO getSource(int i){
    	
    	return data.get(i);
    }
}
