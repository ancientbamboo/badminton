package com.dqty.yuxiaoer.common.datasource;
/**
 * 
 * @author 王照瑞
 *
 */
public enum DataSourceType {
	MASTER("主数据源"), //主数据源
	SLAVE("从数据源");//从数据源
	private final String name;

	DataSourceType(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
