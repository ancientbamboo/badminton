package com.dqty.yuxiaoer.common.configurations.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取系统中的Spring ApplicationContext 对象
 * 
 * @author 王照瑞
 * 
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	protected static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public static ApplicationContext getContext() {
		return context;
	}

	public static <T> T getBean(Class<T> classz) {
		return getContext().getBean(classz);
	}
	
	public static <T> T getBean(String name, Class<T> requiredType) {
		return getContext().getBean(name, requiredType);
	}
}
