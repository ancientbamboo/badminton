package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.UserOpenInfo;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IUserOpenInfoPersistence {

	public boolean insert(UserOpenInfo userOpenInfo) throws Exception;

	public boolean update(UserOpenInfo userOpenInfo) throws Exception;

	public boolean delete(UserOpenInfo userOpenInfo) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<UserOpenInfo> select(UserOpenInfo userOpenInfo) throws Exception;

}
