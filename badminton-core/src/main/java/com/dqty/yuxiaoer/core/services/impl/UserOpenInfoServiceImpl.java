package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.UserOpenInfo;
import com.dqty.yuxiaoer.core.services.IUserOpenInfoService;
import com.dqty.yuxiaoer.core.persistences.IUserOpenInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class UserOpenInfoServiceImpl implements IUserOpenInfoService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserOpenInfoPersistence userOpenInfoPersistence = null;

	@Override
	public Result<UserOpenInfo> addUserOpenInfo(UserOpenInfo userOpenInfo) {
		if(userOpenInfo == null) return new Result<UserOpenInfo>(false, "参数错误");
		try {
			userOpenInfoPersistence.insert(userOpenInfo);
			return new Result<UserOpenInfo>(true, userOpenInfo);
		} catch (Exception e) {
			logger.info("添加[UserOpenInfo]数据时出错", e);
		}
		return new Result<UserOpenInfo>(false, "添加[UserOpenInfo]数据出错");
	}

	@Override
	public Result<UserOpenInfo> editUserOpenInfo(UserOpenInfo userOpenInfo) {
		if(userOpenInfo == null) return new Result<UserOpenInfo>(false, "参数错误");
		try {
			userOpenInfoPersistence.update(userOpenInfo);
			return new Result<UserOpenInfo>(true, userOpenInfo);
		} catch (Exception e) {
			logger.info("编辑[UserOpenInfo]数据时出错", e);
		}
		return new Result<UserOpenInfo>(false, "编辑[UserOpenInfo]数据出错");
	}

	@Override
	public Result<UserOpenInfo> remvoeUserOpenInfo(UserOpenInfo userOpenInfo) {
		if(userOpenInfo == null) return new Result<UserOpenInfo>(false, "参数错误");
		try {
			userOpenInfoPersistence.delete(userOpenInfo);
			return new Result<UserOpenInfo>(true, userOpenInfo);
		} catch (Exception e) {
			logger.info("移除[UserOpenInfo]数据时出错", e);
		}
		return new Result<UserOpenInfo>(false, "移除[UserOpenInfo]数据出错");
	}

	@Override
	public Result<List<UserOpenInfo>> queryUserOpenInfo(UserOpenInfo userOpenInfo) {
		if(userOpenInfo == null) return new Result<List<UserOpenInfo>>(false, "参数错误");
		try {
			List<UserOpenInfo> list = userOpenInfoPersistence.select(userOpenInfo);
			return new Result<List<UserOpenInfo>>(true, list);
		} catch (Exception e) {
			logger.info("查询[UserOpenInfo]数据时出错", e);
		}
		return new Result<List<UserOpenInfo>>(false, "查询[UserOpenInfo]数据出错");
	}

}
