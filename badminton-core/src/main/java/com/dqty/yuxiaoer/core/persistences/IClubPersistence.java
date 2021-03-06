package com.dqty.yuxiaoer.core.persistences;

import com.dqty.yuxiaoer.core.domains.Club;
import java.util.List;

/**
 * @author 王照瑞
 */
public interface IClubPersistence {

	public boolean insert(Club club) throws Exception;

	public boolean update(Club club) throws Exception;

	public boolean delete(Club club) throws Exception;

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	public List<Club> select(Club club) throws Exception;

}
