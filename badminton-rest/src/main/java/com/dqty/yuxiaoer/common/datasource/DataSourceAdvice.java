package com.dqty.yuxiaoer.common.datasource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * 主从数源切换
 * @author 王照瑞
 *
 */
@Aspect
public class DataSourceAdvice {
	private static Log log = LogFactory.getLog(DataSourceAdvice.class);
	private String[] methodPrefix = { "insert", "update", "delete" };//切换成主库的方法名前缀

	@Pointcut("execution(* com.dqty.yuxiaoer.core.persistences..*.*(..))||execution(* com.dqty.yuxiaoer.core.persistences.impl..*.*(..))")
	public void anyMethod() {
	}

	@Before("execution(* com.dqty.yuxiaoer.core.persistences..*.*(..))||execution(* com.dqty.yuxiaoer.core.persistences.impl..*.*(..))")
	public void methodBefore(JoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		for (String methodPrefix : this.methodPrefix) {
			if (methodName.startsWith(methodPrefix)) {
				log.debug("method is [" + methodName + "] use DB datasource is master!");
				DataSourceContextHolder.setDBType(DataSourceType.MASTER);
				return;
			}
		}
		log.debug("method is [" + methodName + "] use DB datasource is slave!");
		DataSourceContextHolder.setDBType(DataSourceType.SLAVE);
	}
}