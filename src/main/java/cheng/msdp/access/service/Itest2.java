package cheng.msdp.access.service;

import com.application.itf.IService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by homelink on 2016/2/4.
 */
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public interface Itest2 extends IService {
    public void tt()throws Exception;
}
