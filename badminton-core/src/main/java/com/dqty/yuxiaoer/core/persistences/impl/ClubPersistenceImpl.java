package com.dqty.yuxiaoer.core.persistences.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dqty.yuxiaoer.core.domains.Club;
import com.dqty.yuxiaoer.core.mappers.IClubMapper;
import com.dqty.yuxiaoer.core.persistences.IClubPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Repository
@Transactional(value="txManager", propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
public class ClubPersistenceImpl implements IClubPersistence {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean insert(Club club) throws Exception {
		if(club == null) return false;
		IClubMapper mapper = sqlSessionTemplate.getMapper(IClubMapper.class);
		mapper.insert(club);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean update(Club club) throws Exception {
		if(club == null) return false;
		IClubMapper mapper = sqlSessionTemplate.getMapper(IClubMapper.class);
		mapper.update(club);
		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor=Exception.class)
	@Override
	public boolean delete(Club club) throws Exception {
		if(club == null) return false;
		IClubMapper mapper = sqlSessionTemplate.getMapper(IClubMapper.class);
		mapper.delete(club);
		return true;
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接。返回值为一个列表，如果查不到内容则返回为空。注意：不支持分页
	 */
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor=Exception.class)
	@Override
	public List<Club> select(Club club) throws Exception {
		if(club == null) return null;
		IClubMapper mapper = sqlSessionTemplate.getMapper(IClubMapper.class);
		return mapper.select(club);
	}

}
