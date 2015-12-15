package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.AccoutBalanceDetail;

/**
 * @author 王照瑞
 */
public interface IAccoutBalanceDetailService {
	/**
	 * 添加
	 */
	public Result<AccoutBalanceDetail> addAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail);
	/**
	 * 编辑
	 */
	public Result<AccoutBalanceDetail> editAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail);
	/**
	 * 移除
	 */
	public Result<AccoutBalanceDetail> remvoeAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail);
	/**
	 * 查询
	 */
	public Result<List<AccoutBalanceDetail>> queryAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail);

}
