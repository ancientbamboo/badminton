package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.AccoutBalance;

/**
 * @author 王照瑞
 */
public interface IAccoutBalanceService {
	/**
	 * 添加
	 */
	public Result<AccoutBalance> addAccoutBalance(AccoutBalance accoutBalance);
	/**
	 * 编辑
	 */
	public Result<AccoutBalance> editAccoutBalance(AccoutBalance accoutBalance);
	/**
	 * 移除
	 */
	public Result<AccoutBalance> remvoeAccoutBalance(AccoutBalance accoutBalance);
	/**
	 * 查询
	 */
	public Result<List<AccoutBalance>> queryAccoutBalance(AccoutBalance accoutBalance);

}
