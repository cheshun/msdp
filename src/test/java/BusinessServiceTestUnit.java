package org.hpin.common.testframework ;

import cheng.lib.exception.BusinessException;
import cheng.msdp.access.model.UserModel;
import com.application.common.context.ApplicationServiceLocator;
import com.application.module.jdbc.itf.IDataBaseService;
import org.junit.Before ;
import org.junit.Test;
import org.junit.runner.RunWith ;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration ;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner ;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional ;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
@Transactional
public  class BusinessServiceTestUnit {
	@Resource
    	IDataBaseService dataBaseService ;
	@Before
	public void init() {

	}

	@Test
	public void getTestUser() throws BusinessException {
	    UserModel userModel = new UserModel();
	    userModel.setUser_code("cheng1");
	    userModel.setUser_name("成应生");
	    dataBaseService.insert(userModel);
	    DataSourceTransactionManager dataSourceTransactionManager = ApplicationServiceLocator.getBean("transactionManager");
	    DefaultTransactionDefinition defaultTransactionDefinition =  ApplicationServiceLocator.getBean("txDefinition");
	    TransactionStatus transactionStatus =dataSourceTransactionManager.getTransaction(defaultTransactionDefinition);
	    try {
		userModel = new UserModel();
		userModel.setUser_code("cheng2");
		dataBaseService.insert(userModel);
//		if(1>0){
//		    throw new Exception("ddd");
//		}
		dataSourceTransactionManager.commit(transactionStatus);//提交事務
	    } catch (Exception e) {
		dataSourceTransactionManager.rollback(transactionStatus);
		e.printStackTrace();
	    }
	}

}