package com.dqty.yuxiaoer.common.datasource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * @author 王照瑞-lenovo
 * 
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	private final Logger loger = Logger.getLogger(AbstractRoutingDataSource.class.getName());
	@Autowired
	private DataSource masterDataSource = null;// 自动注入主数据源
	@Autowired
	private DataSource slaveDataSource = null;// 自动注入从数据源
	@Autowired
	private DataSource defaultTargetDataSource = null;// 自动注入默认数据源

	public DynamicDataSource() {
		super();
	}

	@Override
	protected Object determineCurrentLookupKey() {
		loger.debug("determineCurrentLookupKey() : " + DataSourceContextHolder.getDBType());
		return DataSourceContextHolder.getDBType();
	}

	@Override
	public void afterPropertiesSet() {
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		targetDataSources.put(DataSourceType.MASTER, masterDataSource);// 主数据源
		targetDataSources.put(DataSourceType.SLAVE, slaveDataSource);// 从数据源
		this.setTargetDataSources(targetDataSources);
		super.setDefaultTargetDataSource(defaultTargetDataSource);// 默认数据源
		super.afterPropertiesSet();
	}
}
