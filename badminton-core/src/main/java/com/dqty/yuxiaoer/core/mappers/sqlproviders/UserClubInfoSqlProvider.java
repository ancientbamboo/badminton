

/**
 * @author 王照瑞
 */
package com.dqty.yuxiaoer.core.mappers.sqlproviders;
import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;
import java.util.Map;
import com.dqty.yuxiaoer.core.domains.UserClubInfo;
public class UserClubInfoSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "user_club_info";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `club_id`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#UserClubInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#UserClubInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("clubId", "#UserClubInfo.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("createTime", "#UserClubInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#UserClubInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		UserClubInfo userClubInfo = (UserClubInfo) parameters.get("UserClubInfo");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(userClubInfo.getId() != null) {
			SET("id = #{UserClubInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getUserId() != null) {
			SET("userId = #{UserClubInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getClubId() != null) {
			SET("clubId = #{UserClubInfo.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getCreateTime() != null) {
			SET("createTime = #{UserClubInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(userClubInfo.getUpdateTime() != null) {
			SET("updateTime = #{UserClubInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{UserClubInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{UserClubInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		UserClubInfo userClubInfo = (UserClubInfo) parameters.get("UserClubInfo");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(userClubInfo.getId() != null) {
			WHERE("id = #{UserClubInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getUserId() != null) {
			WHERE("userId = #{UserClubInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getClubId() != null) {
			WHERE("clubId = #{UserClubInfo.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userClubInfo.getCreateTime() != null) {
			WHERE("createTime = #{UserClubInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(userClubInfo.getUpdateTime() != null) {
			WHERE("updateTime = #{UserClubInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
