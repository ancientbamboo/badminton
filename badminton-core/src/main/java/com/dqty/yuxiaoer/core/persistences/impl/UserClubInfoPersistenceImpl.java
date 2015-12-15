package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.UserClubInfo;
import com.dqty.yuxiaoer.core.mappers.IUserClubInfoMapper;
import com.dqty.yuxiaoer.core.persistences.IUserClubInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class UserClubInfoPersistenceImpl implements IUserClubInfoPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(UserClubInfo userClubInfo) throws Exception {
		if(userClubInfo == null) return false;
		IUserClubInfoMapper mapper = sqlSessionTemplate.getMapper(IUserClubInfoMapper.class);
		mapper.insert(userClubInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(UserClubInfo userClubInfo) throws Exception {
		if(userClubInfo == null) return false;
		IUserClubInfoMapper mapper = sqlSessionTemplate.getMapper(IUserClubInfoMapper.class);
		mapper.update(userClubInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(UserClubInfo userClubInfo) throws Exception {
		if(userClubInfo == null) return false;
		IUserClubInfoMapper mapper = sqlSessionTemplate.getMapper(IUserClubInfoMapper.class);
		mapper.delete(userClubInfo);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<UserClubInfo> select(UserClubInfo userClubInfo) throws Exception {
		if(userClubInfo == null) return null;
		IUserClubInfoMapper mapper = sqlSessionTemplate.getMapper(IUserClubInfoMapper.class);
		return mapper.select(userClubInfo);
	}

}
