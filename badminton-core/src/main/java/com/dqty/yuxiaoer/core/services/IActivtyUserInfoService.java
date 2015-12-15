package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;

/**
 * @author 王照瑞
 */
public interface IActivtyUserInfoService {
	/**
	 * 添加
	 */
	public Result<ActivtyUserInfo> addActivtyUserInfo(ActivtyUserInfo activtyUserInfo);
	/**
	 * 编辑
	 */
	public Result<ActivtyUserInfo> editActivtyUserInfo(ActivtyUserInfo activtyUserInfo);
	/**
	 * 移除
	 */
	public Result<ActivtyUserInfo> remvoeActivtyUserInfo(ActivtyUserInfo activtyUserInfo);
	/**
	 * 查询
	 */
	public Result<List<ActivtyUserInfo>> queryActivtyUserInfo(ActivtyUserInfo activtyUserInfo);

}
