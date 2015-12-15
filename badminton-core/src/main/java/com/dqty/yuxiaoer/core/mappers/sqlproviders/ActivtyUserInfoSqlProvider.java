

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
import com.dqty.yuxiaoer.core.domains.ActivtyUserInfo;
public class ActivtyUserInfoSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "activty_user_info";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `activity_id`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#ActivtyUserInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#ActivtyUserInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("activityId", "#ActivtyUserInfo.activityId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("createTime", "#ActivtyUserInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#ActivtyUserInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		ActivtyUserInfo activtyUserInfo = (ActivtyUserInfo) parameters.get("ActivtyUserInfo");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(activtyUserInfo.getId() != null) {
			SET("id = #{ActivtyUserInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getUserId() != null) {
			SET("userId = #{ActivtyUserInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getActivityId() != null) {
			SET("activityId = #{ActivtyUserInfo.activityId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getCreateTime() != null) {
			SET("createTime = #{ActivtyUserInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activtyUserInfo.getUpdateTime() != null) {
			SET("updateTime = #{ActivtyUserInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{ActivtyUserInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{ActivtyUserInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		ActivtyUserInfo activtyUserInfo = (ActivtyUserInfo) parameters.get("ActivtyUserInfo");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(activtyUserInfo.getId() != null) {
			WHERE("id = #{ActivtyUserInfo.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getUserId() != null) {
			WHERE("userId = #{ActivtyUserInfo.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getActivityId() != null) {
			WHERE("activityId = #{ActivtyUserInfo.activityId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activtyUserInfo.getCreateTime() != null) {
			WHERE("createTime = #{ActivtyUserInfo.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activtyUserInfo.getUpdateTime() != null) {
			WHERE("updateTime = #{ActivtyUserInfo.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
