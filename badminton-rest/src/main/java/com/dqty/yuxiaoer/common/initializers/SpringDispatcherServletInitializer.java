/**
 * 
 */
package com.dqty.yuxiaoer.common.initializers;

import javax.servlet.Filter;

import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.dqty.yuxiaoer.common.configurations.ApplicationContext;
import com.dqty.yuxiaoer.common.configurations.RestInterfaceConfiguration;

/**
 * @author 王照瑞lenovo
 *
 */
@Order(1)
public class SpringDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * 初始化应用配置，这里配置相关的“ApplicationContext.java”
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationContext.class };
		
	}

	/**
	 * Spring MVC Rest 相关配置，“RestInterfaceConfiguration.java”
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{RestInterfaceConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/rest/*" };
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();/*配置字符集过滤器*/
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return new Filter[] { filter };
	}
}
