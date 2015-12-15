package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.AccoutBalance;
import com.dqty.yuxiaoer.core.services.IAccoutBalanceService;
import com.dqty.yuxiaoer.core.persistences.IAccoutBalancePersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class AccoutBalanceServiceImpl implements IAccoutBalanceService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IAccoutBalancePersistence accoutBalancePersistence = null;

	@Override
	public Result<AccoutBalance> addAccoutBalance(AccoutBalance accoutBalance) {
		if(accoutBalance == null) return new Result<AccoutBalance>(false, "参数错误");
		try {
			accoutBalancePersistence.insert(accoutBalance);
			return new Result<AccoutBalance>(true, accoutBalance);
		} catch (Exception e) {
			logger.info("添加[AccoutBalance]数据时出错", e);
		}
		return new Result<AccoutBalance>(false, "添加[AccoutBalance]数据出错");
	}

	@Override
	public Result<AccoutBalance> editAccoutBalance(AccoutBalance accoutBalance) {
		if(accoutBalance == null) return new Result<AccoutBalance>(false, "参数错误");
		try {
			accoutBalancePersistence.update(accoutBalance);
			return new Result<AccoutBalance>(true, accoutBalance);
		} catch (Exception e) {
			logger.info("编辑[AccoutBalance]数据时出错", e);
		}
		return new Result<AccoutBalance>(false, "编辑[AccoutBalance]数据出错");
	}

	@Override
	public Result<AccoutBalance> remvoeAccoutBalance(AccoutBalance accoutBalance) {
		if(accoutBalance == null) return new Result<AccoutBalance>(false, "参数错误");
		try {
			accoutBalancePersistence.delete(accoutBalance);
			return new Result<AccoutBalance>(true, accoutBalance);
		} catch (Exception e) {
			logger.info("移除[AccoutBalance]数据时出错", e);
		}
		return new Result<AccoutBalance>(false, "移除[AccoutBalance]数据出错");
	}

	@Override
	public Result<List<AccoutBalance>> queryAccoutBalance(AccoutBalance accoutBalance) {
		if(accoutBalance == null) return new Result<List<AccoutBalance>>(false, "参数错误");
		try {
			List<AccoutBalance> list = accoutBalancePersistence.select(accoutBalance);
			return new Result<List<AccoutBalance>>(true, list);
		} catch (Exception e) {
			logger.info("查询[AccoutBalance]数据时出错", e);
		}
		return new Result<List<AccoutBalance>>(false, "查询[AccoutBalance]数据出错");
	}

}
