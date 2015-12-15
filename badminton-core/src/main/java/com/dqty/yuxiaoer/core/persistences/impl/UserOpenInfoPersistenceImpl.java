package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.UserOpenInfo;
import com.dqty.yuxiaoer.core.mappers.IUserOpenInfoMapper;
import com.dqty.yuxiaoer.core.persistences.IUserOpenInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class UserOpenInfoPersistenceImpl implements IUserOpenInfoPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(UserOpenInfo userOpenInfo) throws Exception {
		if(userOpenInfo == null) return false;
		IUserOpenInfoMapper mapper = sqlSessionTemplate.getMapper(IUserOpenInfoMapper.class);
		mapper.insert(userOpenInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(UserOpenInfo userOpenInfo) throws Exception {
		if(userOpenInfo == null) return false;
		IUserOpenInfoMapper mapper = sqlSessionTemplate.getMapper(IUserOpenInfoMapper.class);
		mapper.update(userOpenInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(UserOpenInfo userOpenInfo) throws Exception {
		if(userOpenInfo == null) return false;
		IUserOpenInfoMapper mapper = sqlSessionTemplate.getMapper(IUserOpenInfoMapper.class);
		mapper.delete(userOpenInfo);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<UserOpenInfo> select(UserOpenInfo userOpenInfo) throws Exception {
		if(userOpenInfo == null) return null;
		IUserOpenInfoMapper mapper = sqlSessionTemplate.getMapper(IUserOpenInfoMapper.class);
		return mapper.select(userOpenInfo);
	}

}
