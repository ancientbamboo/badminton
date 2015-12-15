package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.Club;
import com.dqty.yuxiaoer.core.services.IClubService;
import com.dqty.yuxiaoer.core.persistences.IClubPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class ClubServiceImpl implements IClubService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IClubPersistence clubPersistence = null;

	@Override
	public Result<Club> addClub(Club club) {
		if(club == null) return new Result<Club>(false, "参数错误");
		try {
			clubPersistence.insert(club);
			return new Result<Club>(true, club);
		} catch (Exception e) {
			logger.info("添加[Club]数据时出错", e);
		}
		return new Result<Club>(false, "添加[Club]数据出错");
	}

	@Override
	public Result<Club> editClub(Club club) {
		if(club == null) return new Result<Club>(false, "参数错误");
		try {
			clubPersistence.update(club);
			return new Result<Club>(true, club);
		} catch (Exception e) {
			logger.info("编辑[Club]数据时出错", e);
		}
		return new Result<Club>(false, "编辑[Club]数据出错");
	}

	@Override
	public Result<Club> remvoeClub(Club club) {
		if(club == null) return new Result<Club>(false, "参数错误");
		try {
			clubPersistence.delete(club);
			return new Result<Club>(true, club);
		} catch (Exception e) {
			logger.info("移除[Club]数据时出错", e);
		}
		return new Result<Club>(false, "移除[Club]数据出错");
	}

	@Override
	public Result<List<Club>> queryClub(Club club) {
		if(club == null) return new Result<List<Club>>(false, "参数错误");
		try {
			List<Club> list = clubPersistence.select(club);
			return new Result<List<Club>>(true, list);
		} catch (Exception e) {
			logger.info("查询[Club]数据时出错", e);
		}
		return new Result<List<Club>>(false, "查询[Club]数据出错");
	}

}
