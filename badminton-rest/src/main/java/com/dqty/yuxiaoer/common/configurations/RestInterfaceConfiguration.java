package com.dqty.yuxiaoer.common.configurations;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
/**
 * 
 * @author 王照瑞
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.dqty.yuxiaoer.rest.controllers"})
public class RestInterfaceConfiguration {
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter(){
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(MediaType.TEXT_PLAIN));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(MediaType.APPLICATION_JSON));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(MediaType.APPLICATION_XML));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(new MediaType("text", "plain" , Charset.forName("UTF-8"))));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(new MediaType("*", "*" , Charset.forName("UTF-8"))));
		stringHttpMessageConverter.setSupportedMediaTypes(Arrays.<MediaType> asList(new MediaType("text", "html" , Charset.forName("UTF-8"))));
		return stringHttpMessageConverter;
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
		return new MappingJackson2HttpMessageConverter();
	}
	
	@Bean
	public ConfigurableWebBindingInitializer webBindingInitializer(){
		return new ConfigurableWebBindingInitializer();
	}
	
	@Autowired
	@Bean
	public RequestMappingHandlerAdapter requestMappingHandlerAdapter(ConfigurableWebBindingInitializer webBindingInitializer, StringHttpMessageConverter stringHttpMessageConverter, MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter){
		HttpMessageConverter<?>[] messageConverters = {stringHttpMessageConverter, mappingJackson2HttpMessageConverter};
		RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
		requestMappingHandlerAdapter.setWebBindingInitializer(webBindingInitializer);
		requestMappingHandlerAdapter.setMessageConverters(Arrays.<HttpMessageConverter<?>> asList(messageConverters));
		return requestMappingHandlerAdapter;
	}
}
