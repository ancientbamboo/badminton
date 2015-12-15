package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;
import com.dqty.yuxiaoer.core.mappers.IActivtyUserInfoMapper;
import com.dqty.yuxiaoer.core.persistences.IActivtyUserInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class ActivtyUserInfoPersistenceImpl implements IActivtyUserInfoPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(ActivtyUserInfo activtyUserInfo) throws Exception {
		if(activtyUserInfo == null) return false;
		IActivtyUserInfoMapper mapper = sqlSessionTemplate.getMapper(IActivtyUserInfoMapper.class);
		mapper.insert(activtyUserInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(ActivtyUserInfo activtyUserInfo) throws Exception {
		if(activtyUserInfo == null) return false;
		IActivtyUserInfoMapper mapper = sqlSessionTemplate.getMapper(IActivtyUserInfoMapper.class);
		mapper.update(activtyUserInfo);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(ActivtyUserInfo activtyUserInfo) throws Exception {
		if(activtyUserInfo == null) return false;
		IActivtyUserInfoMapper mapper = sqlSessionTemplate.getMapper(IActivtyUserInfoMapper.class);
		mapper.delete(activtyUserInfo);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<ActivtyUserInfo> select(ActivtyUserInfo activtyUserInfo) throws Exception {
		if(activtyUserInfo == null) return null;
		IActivtyUserInfoMapper mapper = sqlSessionTemplate.getMapper(IActivtyUserInfoMapper.class);
		return mapper.select(activtyUserInfo);
	}

}
