package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.AccoutBalanceDetail;
import com.dqty.yuxiaoer.core.mappers.IAccoutBalanceDetailMapper;
import com.dqty.yuxiaoer.core.persistences.IAccoutBalanceDetailPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class AccoutBalanceDetailPersistenceImpl implements IAccoutBalanceDetailPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(AccoutBalanceDetail accoutBalanceDetail) throws Exception {
		if(accoutBalanceDetail == null) return false;
		IAccoutBalanceDetailMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceDetailMapper.class);
		mapper.insert(accoutBalanceDetail);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(AccoutBalanceDetail accoutBalanceDetail) throws Exception {
		if(accoutBalanceDetail == null) return false;
		IAccoutBalanceDetailMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceDetailMapper.class);
		mapper.update(accoutBalanceDetail);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(AccoutBalanceDetail accoutBalanceDetail) throws Exception {
		if(accoutBalanceDetail == null) return false;
		IAccoutBalanceDetailMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceDetailMapper.class);
		mapper.delete(accoutBalanceDetail);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<AccoutBalanceDetail> select(AccoutBalanceDetail accoutBalanceDetail) throws Exception {
		if(accoutBalanceDetail == null) return null;
		IAccoutBalanceDetailMapper mapper = sqlSessionTemplate.getMapper(IAccoutBalanceDetailMapper.class);
		return mapper.select(accoutBalanceDetail);
	}

}
