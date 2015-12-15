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
import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.ActivtyUserInfoSqlProvider;

/**
 * @author 王照瑞
 */
public interface IActivtyUserInfoMapper {
	@InsertProvider(type = ActivtyUserInfoSqlProvider.class, method = "insert")
	public void insert(@Param("ActivtyUserInfo")ActivtyUserInfo activtyUserInfo);

	@UpdateProvider(type = ActivtyUserInfoSqlProvider.class, method = "update")
	public void update(@Param("ActivtyUserInfo")ActivtyUserInfo activtyUserInfo);

	@DeleteProvider(type = ActivtyUserInfoSqlProvider.class, method = "delete")
	public void delete(@Param("ActivtyUserInfo")ActivtyUserInfo activtyUserInfo);

	@SelectProvider(type = ActivtyUserInfoSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "userId", property = "userId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "activityId", property = "activityId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<ActivtyUserInfo> select(@Param("ActivtyUserInfo")ActivtyUserInfo activtyUserInfo);

}
