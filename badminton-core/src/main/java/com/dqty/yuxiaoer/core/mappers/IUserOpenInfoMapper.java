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
import com.dqty.yuxiaoer.core.domains.UserOpenInfo;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.UserOpenInfoSqlProvider;

/**
 * @author 王照瑞
 */
public interface IUserOpenInfoMapper {
	@InsertProvider(type = UserOpenInfoSqlProvider.class, method = "insert")
	public void insert(@Param("UserOpenInfo")UserOpenInfo userOpenInfo);

	@UpdateProvider(type = UserOpenInfoSqlProvider.class, method = "update")
	public void update(@Param("UserOpenInfo")UserOpenInfo userOpenInfo);

	@DeleteProvider(type = UserOpenInfoSqlProvider.class, method = "delete")
	public void delete(@Param("UserOpenInfo")UserOpenInfo userOpenInfo);

	@SelectProvider(type = UserOpenInfoSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "userId", property = "userId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "openType", property = "openType", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "openUserId", property = "openUserId", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<UserOpenInfo> select(@Param("UserOpenInfo")UserOpenInfo userOpenInfo);

}
