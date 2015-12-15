package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.AccoutBalanceDetail;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IAccoutBalanceDetailPersistence {

	public boolean insert(AccoutBalanceDetail accoutBalanceDetail) throws Exception;

	public boolean update(AccoutBalanceDetail accoutBalanceDetail) throws Exception;

	public boolean delete(AccoutBalanceDetail accoutBalanceDetail) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<AccoutBalanceDetail> select(AccoutBalanceDetail accoutBalanceDetail) throws Exception;

}
