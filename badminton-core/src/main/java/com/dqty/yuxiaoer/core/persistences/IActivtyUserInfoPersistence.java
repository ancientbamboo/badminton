package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IActivtyUserInfoPersistence {

	public boolean insert(ActivtyUserInfo activtyUserInfo) throws Exception;

	public boolean update(ActivtyUserInfo activtyUserInfo) throws Exception;

	public boolean delete(ActivtyUserInfo activtyUserInfo) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<ActivtyUserInfo> select(ActivtyUserInfo activtyUserInfo) throws Exception;

}
