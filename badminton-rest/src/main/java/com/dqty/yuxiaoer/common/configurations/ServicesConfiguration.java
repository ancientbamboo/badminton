package com.dqty.yuxiaoer.common.configurations;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author 王照瑞
 *
 */
@Configuration
@ComponentScan(basePackages = {
		"com.dqty.yuxiaoer.core.persistences", 
		"com.dqty.yuxiaoer.core.services"})
@EnableTransactionManagement
public class ServicesConfiguration {
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.dqty.yuxiaoer.core.mappers");
		return mapperScannerConfigurer;
	}
	
}
