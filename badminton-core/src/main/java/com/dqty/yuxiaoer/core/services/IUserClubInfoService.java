package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.UserClubInfo;

/**
 * @author 王照瑞
 */
public interface IUserClubInfoService {
	/**
	 * 添加
	 */
	public Result<UserClubInfo> addUserClubInfo(UserClubInfo userClubInfo);
	/**
	 * 编辑
	 */
	public Result<UserClubInfo> editUserClubInfo(UserClubInfo userClubInfo);
	/**
	 * 移除
	 */
	public Result<UserClubInfo> remvoeUserClubInfo(UserClubInfo userClubInfo);
	/**
	 * 查询
	 */
	public Result<List<UserClubInfo>> queryUserClubInfo(UserClubInfo userClubInfo);

}
