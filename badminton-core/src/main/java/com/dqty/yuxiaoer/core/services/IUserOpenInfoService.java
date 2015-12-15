package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.UserOpenInfo;

/**
 * @author 王照瑞
 */
public interface IUserOpenInfoService {
	/**
	 * 添加
	 */
	public Result<UserOpenInfo> addUserOpenInfo(UserOpenInfo userOpenInfo);
	/**
	 * 编辑
	 */
	public Result<UserOpenInfo> editUserOpenInfo(UserOpenInfo userOpenInfo);
	/**
	 * 移除
	 */
	public Result<UserOpenInfo> remvoeUserOpenInfo(UserOpenInfo userOpenInfo);
	/**
	 * 查询
	 */
	public Result<List<UserOpenInfo>> queryUserOpenInfo(UserOpenInfo userOpenInfo);

}
