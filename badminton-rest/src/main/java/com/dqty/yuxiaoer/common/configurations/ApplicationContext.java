package com.dqty.yuxiaoer.common.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dqty.yuxiaoer.common.configurations.context.ApplicationContextUtil;
/**
 * 
 * @author 王照瑞
 *
 */
@Configuration
@Import({DataSourceConfiguration.class, ServicesConfiguration.class})
@EnableTransactionManagement
public class ApplicationContext {
	@Bean
	public static PropertySourcesPlaceholderConfigurer placehodlerConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public ApplicationContextUtil springContext() {
		return new ApplicationContextUtil();
	}
}
