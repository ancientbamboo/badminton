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
import com.dqty.yuxiaoer.core.domains.UserClubInfo;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.UserClubInfoSqlProvider;

/**
 * @author 王照瑞
 */
public interface IUserClubInfoMapper {
	@InsertProvider(type = UserClubInfoSqlProvider.class, method = "insert")
	public void insert(@Param("UserClubInfo")UserClubInfo userClubInfo);

	@UpdateProvider(type = UserClubInfoSqlProvider.class, method = "update")
	public void update(@Param("UserClubInfo")UserClubInfo userClubInfo);

	@DeleteProvider(type = UserClubInfoSqlProvider.class, method = "delete")
	public void delete(@Param("UserClubInfo")UserClubInfo userClubInfo);

	@SelectProvider(type = UserClubInfoSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "userId", property = "userId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "clubId", property = "clubId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<UserClubInfo> select(@Param("UserClubInfo")UserClubInfo userClubInfo);

}
