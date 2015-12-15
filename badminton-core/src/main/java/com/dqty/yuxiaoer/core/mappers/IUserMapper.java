package com.dqty.yuxiaoer.core.mappers;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import java.util.List;
import com.dqty.yuxiaoer.core.domains.User;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.UserSqlProvider;

/**
 * @author 王照瑞
 */
public interface IUserMapper {
	@InsertProvider(type = UserSqlProvider.class, method = "insert")
	public void insert(@Param("User")User user);

	@UpdateProvider(type = UserSqlProvider.class, method = "update")
	public void update(@Param("User")User user);

	@DeleteProvider(type = UserSqlProvider.class, method = "delete")
	public void delete(@Param("User")User user);

	@SelectProvider(type = UserSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "userId", property = "userId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "nickName", property = "nickName", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "passWd", property = "passWd", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "tel", property = "tel", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "avatarUrl", property = "avatarUrl", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "gender", property = "gender", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "birthday", property = "birthday", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "playAge", property = "playAge", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "userLevel", property = "userLevel", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "status", property = "status", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "desc", property = "desc", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<User> select(@Param("User")User user);

}
