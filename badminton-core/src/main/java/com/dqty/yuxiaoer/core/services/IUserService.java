package com.dqty.yuxiaoer.core.services;

import java.util.List;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.User;

/**
 * @author 王照瑞
 */
public interface IUserService {
	/**
	 * 添加
	 */
	public Result<User> addUser(User user);
	/**
	 * 编辑
	 */
	public Result<User> editUser(User user);
	/**
	 * 移除
	 */
	public Result<User> remvoeUser(User user);
	/**
	 * 查询
	 */
	public Result<List<User>> queryUser(User user);

}
