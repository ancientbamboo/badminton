package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.AccoutBalance;
import com.dqty.yuxiaoer.core.mappers.IAccoutBalanceMapper;
import com.dqty.yuxiaoer.core.persistences.IAccoutBalancePersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class AccoutBalancePersistenceImpl implements IAccoutBalancePersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(AccoutBalance accoutBalance) throws Exception {
		if(accoutBalance == null) return false;
		IAccoutBalanceMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceMapper.class);
		mapper.insert(accoutBalance);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(AccoutBalance accoutBalance) throws Exception {
		if(accoutBalance == null) return false;
		IAccoutBalanceMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceMapper.class);
		mapper.update(accoutBalance);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(AccoutBalance accoutBalance) throws Exception {
		if(accoutBalance == null) return false;
		IAccoutBalanceMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceMapper.class);
		mapper.delete(accoutBalance);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<AccoutBalance> select(AccoutBalance accoutBalance) throws Exception {
		if(accoutBalance == null) return null;
		IAccoutBalanceMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceMapper.class);
		return mapper.select(accoutBalance);
	}

}
