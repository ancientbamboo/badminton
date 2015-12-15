package com.dqty.yuxiaoer.common.datasource;
/**
 * 
 * @author 王照瑞-lenovo
 *
 */
public class DataSourceContextHolder {
	private static final ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<DataSourceType>();

	public static void setDBType(DataSourceType dsType) {
		contextHolder.set(dsType);
	}

	public static DataSourceType getDBType() {
		return contextHolder.get();
	}

	public static void clearDBType() {
		contextHolder.remove();
	}
}
