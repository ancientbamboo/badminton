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
import com.dqty.yuxiaoer.core.domains.Activity;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.ActivitySqlProvider;

/**
 * @author 王照瑞
 */
public interface IActivityMapper {
	@InsertProvider(type = ActivitySqlProvider.class, method = "insert")
	public void insert(@Param("Activity")Activity activity);

	@UpdateProvider(type = ActivitySqlProvider.class, method = "update")
	public void update(@Param("Activity")Activity activity);

	@DeleteProvider(type = ActivitySqlProvider.class, method = "delete")
	public void delete(@Param("Activity")Activity activity);

	@SelectProvider(type = ActivitySqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "clubId", property = "clubId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "initiatorId", property = "initiatorId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "activityName", property = "activityName", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "startTime", property = "startTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "endTime", property = "endTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "position", property = "position", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "maxNumber", property = "maxNumber", javaType = java.lang.Integer.class, jdbcType = JdbcType.INTEGER),
			@Result(column = "payType", property = "payType", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "payAmount", property = "payAmount", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "status", property = "status", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "desc", property = "desc", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<Activity> select(@Param("Activity")Activity activity);

}
