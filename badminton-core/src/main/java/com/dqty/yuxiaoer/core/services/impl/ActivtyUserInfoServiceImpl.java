package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;
import com.dqty.yuxiaoer.core.services.IActivtyUserInfoService;
import com.dqty.yuxiaoer.core.persistences.IActivtyUserInfoPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class ActivtyUserInfoServiceImpl implements IActivtyUserInfoService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IActivtyUserInfoPersistence activtyUserInfoPersistence = null;

	@Override
	public Result<ActivtyUserInfo> addActivtyUserInfo(ActivtyUserInfo activtyUserInfo) {
		if(activtyUserInfo == null) return new Result<ActivtyUserInfo>(false, "参数错误");
		try {
			activtyUserInfoPersistence.insert(activtyUserInfo);
			return new Result<ActivtyUserInfo>(true, activtyUserInfo);
		} catch (Exception e) {
			logger.info("添加[ActivtyUserInfo]数据时出错", e);
		}
		return new Result<ActivtyUserInfo>(false, "添加[ActivtyUserInfo]数据出错");
	}

	@Override
	public Result<ActivtyUserInfo> editActivtyUserInfo(ActivtyUserInfo activtyUserInfo) {
		if(activtyUserInfo == null) return new Result<ActivtyUserInfo>(false, "参数错误");
		try {
			activtyUserInfoPersistence.update(activtyUserInfo);
			return new Result<ActivtyUserInfo>(true, activtyUserInfo);
		} catch (Exception e) {
			logger.info("编辑[ActivtyUserInfo]数据时出错", e);
		}
		return new Result<ActivtyUserInfo>(false, "编辑[ActivtyUserInfo]数据出错");
	}

	@Override
	public Result<ActivtyUserInfo> remvoeActivtyUserInfo(ActivtyUserInfo activtyUserInfo) {
		if(activtyUserInfo == null) return new Result<ActivtyUserInfo>(false, "参数错误");
		try {
			activtyUserInfoPersistence.delete(activtyUserInfo);
			return new Result<ActivtyUserInfo>(true, activtyUserInfo);
		} catch (Exception e) {
			logger.info("移除[ActivtyUserInfo]数据时出错", e);
		}
		return new Result<ActivtyUserInfo>(false, "移除[ActivtyUserInfo]数据出错");
	}

	@Override
	public Result<List<ActivtyUserInfo>> queryActivtyUserInfo(ActivtyUserInfo activtyUserInfo) {
		if(activtyUserInfo == null) return new Result<List<ActivtyUserInfo>>(false, "参数错误");
		try {
			List<ActivtyUserInfo> list = activtyUserInfoPersistence.select(activtyUserInfo);
			return new Result<List<ActivtyUserInfo>>(true, list);
		} catch (Exception e) {
			logger.info("查询[ActivtyUserInfo]数据时出错", e);
		}
		return new Result<List<ActivtyUserInfo>>(false, "查询[ActivtyUserInfo]数据出错");
	}

}
