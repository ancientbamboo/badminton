package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.User;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IUserPersistence {

	public boolean insert(User user) throws Exception;

	public boolean update(User user) throws Exception;

	public boolean delete(User user) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<User> select(User user) throws Exception;

}
