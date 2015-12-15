package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.User;
import com.dqty.yuxiaoer.core.mappers.IUserMapper;
import com.dqty.yuxiaoer.core.persistences.IUserPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class UserPersistenceImpl implements IUserPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(User user) throws Exception {
		if(user == null) return false;
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		mapper.insert(user);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(User user) throws Exception {
		if(user == null) return false;
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		mapper.update(user);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(User user) throws Exception {
		if(user == null) return false;
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		mapper.delete(user);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<User> select(User user) throws Exception {
		if(user == null) return null;
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		return mapper.select(user);
	}

}
