package cheng.msdp.framework.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 

public class ApplicationActionInterceptor {
	protected Logger logger = LoggerFactory
			.getLogger(ApplicationActionInterceptor.class);

	public void doBefore(JoinPoint jp) {
		logger.info("log Begining method: " + getClassName(jp) + ":"
				+ getMethodName(jp));
	}

	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long time = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		time = System.currentTimeMillis() - time;
		logger.info("process time: " + time + " ms");
		return retVal;
	}

	public void doAfter(JoinPoint jp) {
		logger.info("log Ending method: " + getClassName(jp) + ":"
				+ getMethodName(jp));
	}

	public void doThrowing(JoinPoint jp, Throwable ex) {
		logger.info("method " + getClassName(jp) + ":" + getMethodName(jp)+" throws "+ex.getMessage());
	}

	private String getClassName(JoinPoint jp) {
		return jp.getTarget().getClass().getName();
	}

	private String getMethodName(JoinPoint jp) {
		return jp.getSignature().getName();
	}
}
