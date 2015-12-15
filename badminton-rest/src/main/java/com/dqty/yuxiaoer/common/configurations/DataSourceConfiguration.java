package com.dqty.yuxiaoer.common.configurations;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dqty.yuxiaoer.common.datasource.DataSourceAdvice;
import com.dqty.yuxiaoer.common.datasource.DynamicDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 
 * @author 王照瑞
 *
 */
@Configuration
@PropertySource(name = "jdbc", value = "classpath:jdbc.properties", ignoreResourceNotFound = false)
@EnableTransactionManagement
public class DataSourceConfiguration {
	@Value("${jdbc.driverClass}")
	private String driverClass = "com.mysql.jdbc.Driver";
	@Value("${master.jdbc.url}")
	private String masterUrl = "jdbc:mysql://120.25.124.2:3306/ymq";
	@Value("${master.jdbc.user}")
	private String masterUsername = "ymq";
	@Value("${master.jdbc.password}")
	private String masterPassword = "123456";
	@Value("${slaver.jdbc.url}")
	private String slaverUrl = "jdbc:mysql://120.25.124.2:3306/ymq";
	@Value("${slaver.jdbc.user}")
	private String slaverUsername = "ymq";
	@Value("${slaver.jdbc.password}")
	private String slaverPassword = "123456";

	/**
	 * 默认数据源
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean(name = "defaultTargetDataSource", autowire = Autowire.BY_NAME)
	public DataSource defaultTargetDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(masterUrl);
		dataSource.setUser(masterUsername);
		dataSource.setPassword(masterPassword);
		dataSource.setMinPoolSize(1);
		dataSource.setMaxPoolSize(20);
		dataSource.setMaxIdleTime(120000);
		dataSource.setAcquireIncrement(2);
		dataSource.setMaxStatements(0);
		dataSource.setInitialPoolSize(2);
		dataSource.setIdleConnectionTestPeriod(1800);
		dataSource.setAcquireRetryAttempts(30);
		dataSource.setBreakAfterAcquireFailure(true);
		dataSource.setTestConnectionOnCheckout(false);
		return dataSource;
	}

	/**
	 * 主数据源
	 * 
	 * @return
	 */
	@Bean(name = "masterDataSource", autowire = Autowire.BY_NAME)
	public DataSource masterDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(masterUrl);
		dataSource.setUser(masterUsername);
		dataSource.setPassword(masterPassword);
		dataSource.setMinPoolSize(1);
		dataSource.setMaxPoolSize(20);
		dataSource.setMaxIdleTime(120000);
		dataSource.setAcquireIncrement(2);
		dataSource.setMaxStatements(0);
		dataSource.setInitialPoolSize(2);
		dataSource.setIdleConnectionTestPeriod(1800);
		dataSource.setAcquireRetryAttempts(30);
		dataSource.setBreakAfterAcquireFailure(true);
		dataSource.setTestConnectionOnCheckout(false);
		return dataSource;
	}

	/**
	 * 从数据源
	 * 
	 * @return
	 */
	@Bean(name = "slaveDataSource", autowire = Autowire.BY_NAME)
	public DataSource slaveDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(slaverUrl);
		dataSource.setUser(slaverUsername);
		dataSource.setPassword(slaverPassword);
		dataSource.setMinPoolSize(1);
		dataSource.setMaxPoolSize(20);
		dataSource.setMaxIdleTime(120000);
		dataSource.setAcquireIncrement(2);
		dataSource.setMaxStatements(0);
		dataSource.setInitialPoolSize(2);
		dataSource.setIdleConnectionTestPeriod(1800);
		dataSource.setAcquireRetryAttempts(30);
		dataSource.setBreakAfterAcquireFailure(true);
		dataSource.setTestConnectionOnCheckout(false);
		return dataSource;
	}

	@Bean(name = "dataSource", autowire = Autowire.BY_NAME)
	public DataSource dataSource() {
		DynamicDataSource dataSource = new DynamicDataSource();
		return dataSource;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public SqlSessionFactoryBean sqlSessionFactory() {// 通过名称自动注入
		DefaultResourceLoader drl = new DefaultResourceLoader();
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setConfigLocation(drl.getResource("classpath:mybatis-config.xml"));
		return sqlSessionFactory;
	}
	
	@Autowired
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator(){
		return new AnnotationAwareAspectJAutoProxyCreator();
	}
	
	@Bean
	public DataSourceAdvice dataSourceAdvice() {
		DataSourceAdvice dataSourceAdvice = new DataSourceAdvice();
		return dataSourceAdvice;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public DataSourceTransactionManager txManager() {
		DataSourceTransactionManager txManager = new org.springframework.jdbc.datasource.DataSourceTransactionManager();
		return txManager;
	}

}
