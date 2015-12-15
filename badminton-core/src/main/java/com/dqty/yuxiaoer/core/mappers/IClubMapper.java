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
import com.dqty.yuxiaoer.core.domains.Club;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.ClubSqlProvider;

/**
 * @author 王照瑞
 */
public interface IClubMapper {
	@InsertProvider(type = ClubSqlProvider.class, method = "insert")
	public void insert(@Param("Club")Club club);

	@UpdateProvider(type = ClubSqlProvider.class, method = "update")
	public void update(@Param("Club")Club club);

	@DeleteProvider(type = ClubSqlProvider.class, method = "delete")
	public void delete(@Param("Club")Club club);

	@SelectProvider(type = ClubSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "fullName", property = "fullName", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "shortName", property = "shortName", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "position", property = "position", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "presidentName", property = "presidentName", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "presidentTel", property = "presidentTel", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "clubQqGroups", property = "clubQqGroups", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "clubSite", property = "clubSite", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "consumeMode", property = "consumeMode", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "source", property = "source", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "status", property = "status", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "desc", property = "desc", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "robotInfo", property = "robotInfo", javaType = java.lang.String.class, jdbcType = JdbcType.VARCHAR),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<Club> select(@Param("Club")Club club);

}
