package cheng.msdp.access.service;

import cheng.msdp.access.model.UserModel;
import com.application.module.jdbc.itf.IDataBaseService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by homelink on 2016/2/4.
 */
@Component
public class Test2Impl implements Itest2 {
    @Resource
    Itest itest ;
    @Resource
    IDataBaseService dataBaseService ;
    @Override public void tt() throws Exception{
        dataBaseService.insert(new UserModel());
        itest.t();
    }
}
