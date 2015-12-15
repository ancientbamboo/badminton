package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.Activity;
import com.dqty.yuxiaoer.core.mappers.IActivityMapper;
import com.dqty.yuxiaoer.core.persistences.IActivityPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class ActivityPersistenceImpl implements IActivityPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(Activity activity) throws Exception {
		if(activity == null) return false;
		IActivityMapper mapper = sqlSessionTemplate.getMapper(IActivityMapper.class);
		mapper.insert(activity);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(Activity activity) throws Exception {
		if(activity == null) return false;
		IActivityMapper mapper = sqlSessionTemplate.getMapper(IActivityMapper.class);
		mapper.update(activity);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(Activity activity) throws Exception {
		if(activity == null) return false;
		IActivityMapper mapper = sqlSessionTemplate.getMapper(IActivityMapper.class);
		mapper.delete(activity);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<Activity> select(Activity activity) throws Exception {
		if(activity == null) return null;
		IActivityMapper mapper = sqlSessionTemplate.getMapper(IActivityMapper.class);
		return mapper.select(activity);
	}

}
