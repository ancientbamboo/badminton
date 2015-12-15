package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.AccoutBalance;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IAccoutBalancePersistence {

	public boolean insert(AccoutBalance accoutBalance) throws Exception;

	public boolean update(AccoutBalance accoutBalance) throws Exception;

	public boolean delete(AccoutBalance accoutBalance) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<AccoutBalance> select(AccoutBalance accoutBalance) throws Exception;

}
