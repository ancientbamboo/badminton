package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.Activity;
import com.dqty.yuxiaoer.core.services.IActivityService;
import com.dqty.yuxiaoer.core.persistences.IActivityPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class ActivityServiceImpl implements IActivityService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IActivityPersistence activityPersistence = null;

	@Override
	public Result<Activity> addActivity(Activity activity) {
		if(activity == null) return new Result<Activity>(false, "参数错误");
		try {
			activityPersistence.insert(activity);
			return new Result<Activity>(true, activity);
		} catch (Exception e) {
			logger.info("添加[Activity]数据时出错", e);
		}
		return new Result<Activity>(false, "添加[Activity]数据出错");
	}

	@Override
	public Result<Activity> editActivity(Activity activity) {
		if(activity == null) return new Result<Activity>(false, "参数错误");
		try {
			activityPersistence.update(activity);
			return new Result<Activity>(true, activity);
		} catch (Exception e) {
			logger.info("编辑[Activity]数据时出错", e);
		}
		return new Result<Activity>(false, "编辑[Activity]数据出错");
	}

	@Override
	public Result<Activity> remvoeActivity(Activity activity) {
		if(activity == null) return new Result<Activity>(false, "参数错误");
		try {
			activityPersistence.delete(activity);
			return new Result<Activity>(true, activity);
		} catch (Exception e) {
			logger.info("移除[Activity]数据时出错", e);
		}
		return new Result<Activity>(false, "移除[Activity]数据出错");
	}

	@Override
	public Result<List<Activity>> queryActivity(Activity activity) {
		if(activity == null) return new Result<List<Activity>>(false, "参数错误");
		try {
			List<Activity> list = activityPersistence.select(activity);
			return new Result<List<Activity>>(true, list);
		} catch (Exception e) {
			logger.info("查询[Activity]数据时出错", e);
		}
		return new Result<List<Activity>>(false, "查询[Activity]数据出错");
	}

}
