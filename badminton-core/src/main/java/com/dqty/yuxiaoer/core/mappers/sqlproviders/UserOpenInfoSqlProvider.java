

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
import com.dqty.yuxiaoer.core.domains.UserOpenInfo;
public class UserOpenInfoSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "user_open_info";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `open_type`, `open_user_id`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#UserOpenInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#UserOpenInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("openType", "#UserOpenInfo.openType, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("openUserId", "#UserOpenInfo.openUserId, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("createTime", "#UserOpenInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#UserOpenInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		UserOpenInfo userOpenInfo = (UserOpenInfo) parameters.get("UserOpenInfo");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(userOpenInfo.getId() != null) {
			SET("id = #{UserOpenInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userOpenInfo.getUserId() != null) {
			SET("userId = #{UserOpenInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userOpenInfo.getOpenType() != null) {
			SET("openType = #{UserOpenInfo.openType, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(userOpenInfo.getOpenUserId() != null) {
			SET("openUserId = #{UserOpenInfo.openUserId, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(userOpenInfo.getCreateTime() != null) {
			SET("createTime = #{UserOpenInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(userOpenInfo.getUpdateTime() != null) {
			SET("updateTime = #{UserOpenInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{UserOpenInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{UserOpenInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		UserOpenInfo userOpenInfo = (UserOpenInfo) parameters.get("UserOpenInfo");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(userOpenInfo.getId() != null) {
			WHERE("id = #{UserOpenInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userOpenInfo.getUserId() != null) {
			WHERE("userId = #{UserOpenInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(userOpenInfo.getOpenType() != null) {
			WHERE("openType = #{UserOpenInfo.openType, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(userOpenInfo.getOpenUserId() != null) {
			WHERE("openUserId = #{UserOpenInfo.openUserId, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(userOpenInfo.getCreateTime() != null) {
			WHERE("createTime = #{UserOpenInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(userOpenInfo.getUpdateTime() != null) {
			WHERE("updateTime = #{UserOpenInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
