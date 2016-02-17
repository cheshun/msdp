package cheng.msdp.access.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by homelink on 2016/2/4.
 */
@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class testimpl implements Itest {
    @Override public void t() throws Exception {
	int i = 10 ;
	int j = i/0 ;
    }
}
