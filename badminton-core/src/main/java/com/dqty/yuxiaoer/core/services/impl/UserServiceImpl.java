package com.dqty.yuxiaoer.core.services.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.dqty.yuxiaoer.core.domains.Result;
import com.dqty.yuxiaoer.core.domains.User;
import com.dqty.yuxiaoer.core.services.IUserService;
import com.dqty.yuxiaoer.core.persistences.IUserPersistence;
import java.util.List;

/**
 * @author 王照瑞
 */
@Service
public class UserServiceImpl implements IUserService {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private IUserPersistence userPersistence = null;

	@Override
	public Result<User> addUser(User user) {
		if(user == null) return new Result<User>(false, "参数错误");
		try {
			userPersistence.insert(user);
			return new Result<User>(true, user);
		} catch (Exception e) {
			logger.info("添加[User]数据时出错", e);
		}
		return new Result<User>(false, "添加[User]数据出错");
	}

	@Override
	public Result<User> editUser(User user) {
		if(user == null) return new Result<User>(false, "参数错误");
		try {
			userPersistence.update(user);
			return new Result<User>(true, user);
		} catch (Exception e) {
			logger.info("编辑[User]数据时出错", e);
		}
		return new Result<User>(false, "编辑[User]数据出错");
	}

	@Override
	public Result<User> remvoeUser(User user) {
		if(user == null) return new Result<User>(false, "参数错误");
		try {
			userPersistence.delete(user);
			return new Result<User>(true, user);
		} catch (Exception e) {
			logger.info("移除[User]数据时出错", e);
		}
		return new Result<User>(false, "移除[User]数据出错");
	}

	@Override
	public Result<List<User>> queryUser(User user) {
		if(user == null) return new Result<List<User>>(false, "参数错误");
		try {
			List<User> list = userPersistence.select(user);
			return new Result<List<User>>(true, list);
		} catch (Exception e) {
			logger.info("查询[User]数据时出错", e);
		}
		return new Result<List<User>>(false, "查询[User]数据出错");
	}

}
