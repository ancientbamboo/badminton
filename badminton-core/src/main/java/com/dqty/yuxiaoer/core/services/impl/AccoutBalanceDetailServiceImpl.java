package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.AccoutBalanceDetail;
import com.dqty.yuxiaoer.core.services.IAccoutBalanceDetailService;
import com.dqty.yuxiaoer.core.persistences.IAccoutBalanceDetailPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class AccoutBalanceDetailServiceImpl implements IAccoutBalanceDetailService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IAccoutBalanceDetailPersistence accoutBalanceDetailPersistence = null;

	@Override
	public Result<AccoutBalanceDetail> addAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail) {
		if(accoutBalanceDetail == null) return new Result<AccoutBalanceDetail>(false, "参数错误");
		try {
			accoutBalanceDetailPersistence.insert(accoutBalanceDetail);
			return new Result<AccoutBalanceDetail>(true, accoutBalanceDetail);
		} catch (Exception e) {
			logger.info("添加[AccoutBalanceDetail]数据时出错", e);
		}
		return new Result<AccoutBalanceDetail>(false, "添加[AccoutBalanceDetail]数据出错");
	}

	@Override
	public Result<AccoutBalanceDetail> editAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail) {
		if(accoutBalanceDetail == null) return new Result<AccoutBalanceDetail>(false, "参数错误");
		try {
			accoutBalanceDetailPersistence.update(accoutBalanceDetail);
			return new Result<AccoutBalanceDetail>(true, accoutBalanceDetail);
		} catch (Exception e) {
			logger.info("编辑[AccoutBalanceDetail]数据时出错", e);
		}
		return new Result<AccoutBalanceDetail>(false, "编辑[AccoutBalanceDetail]数据出错");
	}

	@Override
	public Result<AccoutBalanceDetail> remvoeAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail) {
		if(accoutBalanceDetail == null) return new Result<AccoutBalanceDetail>(false, "参数错误");
		try {
			accoutBalanceDetailPersistence.delete(accoutBalanceDetail);
			return new Result<AccoutBalanceDetail>(true, accoutBalanceDetail);
		} catch (Exception e) {
			logger.info("移除[AccoutBalanceDetail]数据时出错", e);
		}
		return new Result<AccoutBalanceDetail>(false, "移除[AccoutBalanceDetail]数据出错");
	}

	@Override
	public Result<List<AccoutBalanceDetail>> queryAccoutBalanceDetail(AccoutBalanceDetail accoutBalanceDetail) {
		if(accoutBalanceDetail == null) return new Result<List<AccoutBalanceDetail>>(false, "参数错误");
		try {
			List<AccoutBalanceDetail> list = accoutBalanceDetailPersistence.select(accoutBalanceDetail);
			return new Result<List<AccoutBalanceDetail>>(true, list);
		} catch (Exception e) {
			logger.info("查询[AccoutBalanceDetail]数据时出错", e);
		}
		return new Result<List<AccoutBalanceDetail>>(false, "查询[AccoutBalanceDetail]数据出错");
	}

}
