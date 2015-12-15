package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.Activity;

/**
 * @author 王照瑞
 */
public interface IActivityService {
	/**
	 * 添加
	 */
	public Result<Activity> addActivity(Activity activity);
	/**
	 * 编辑
	 */
	public Result<Activity> editActivity(Activity activity);
	/**
	 * 移除
	 */
	public Result<Activity> remvoeActivity(Activity activity);
	/**
	 * 查询
	 */
	public Result<List<Activity>> queryActivity(Activity activity);

}
