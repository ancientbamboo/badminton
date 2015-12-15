package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.Club;

/**
 * @author 王照瑞
 */
public interface IClubService {
	/**
	 * 添加
	 */
	public Result<Club> addClub(Club club);
	/**
	 * 编辑
	 */
	public Result<Club> editClub(Club club);
	/**
	 * 移除
	 */
	public Result<Club> remvoeClub(Club club);
	/**
	 * 查询
	 */
	public Result<List<Club>> queryClub(Club club);

}
