package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.UserClubInfo;
import com.dqty.yuxiaoer.core.services.IUserClubInfoService;
import com.dqty.yuxiaoer.core.persistences.IUserClubInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class UserClubInfoServiceImpl implements IUserClubInfoService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserClubInfoPersistence userClubInfoPersistence = null;

	@Override
	public Result<UserClubInfo> addUserClubInfo(UserClubInfo userClubInfo) {
		if(userClubInfo == null) return new Result<UserClubInfo>(false, "参数错误");
		try {
			userClubInfoPersistence.insert(userClubInfo);
			return new Result<UserClubInfo>(true, userClubInfo);
		} catch (Exception e) {
			logger.info("添加[UserClubInfo]数据时出错", e);
		}
		return new Result<UserClubInfo>(false, "添加[UserClubInfo]数据出错");
	}

	@Override
	public Result<UserClubInfo> editUserClubInfo(UserClubInfo userClubInfo) {
		if(userClubInfo == null) return new Result<UserClubInfo>(false, "参数错误");
		try {
			userClubInfoPersistence.update(userClubInfo);
			return new Result<UserClubInfo>(true, userClubInfo);
		} catch (Exception e) {
			logger.info("编辑[UserClubInfo]数据时出错", e);
		}
		return new Result<UserClubInfo>(false, "编辑[UserClubInfo]数据出错");
	}

	@Override
	public Result<UserClubInfo> remvoeUserClubInfo(UserClubInfo userClubInfo) {
		if(userClubInfo == null) return new Result<UserClubInfo>(false, "参数错误");
		try {
			userClubInfoPersistence.delete(userClubInfo);
			return new Result<UserClubInfo>(true, userClubInfo);
		} catch (Exception e) {
			logger.info("移除[UserClubInfo]数据时出错", e);
		}
		return new Result<UserClubInfo>(false, "移除[UserClubInfo]数据出错");
	}

	@Override
	public Result<List<UserClubInfo>> queryUserClubInfo(UserClubInfo userClubInfo) {
		if(userClubInfo == null) return new Result<List<UserClubInfo>>(false, "参数错误");
		try {
			List<UserClubInfo> list = userClubInfoPersistence.select(userClubInfo);
			return new Result<List<UserClubInfo>>(true, list);
		} catch (Exception e) {
			logger.info("查询[UserClubInfo]数据时出错", e);
		}
		return new Result<List<UserClubInfo>>(false, "查询[UserClubInfo]数据出错");
	}

}
