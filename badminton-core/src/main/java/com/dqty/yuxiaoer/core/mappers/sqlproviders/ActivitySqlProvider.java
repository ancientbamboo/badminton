

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
import com.dqty.yuxiaoer.core.domains.Activity;
public class ActivitySqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "activity";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `club_id`, `initiator_id`, `activity_name`, `start_time`, `end_time`, `position`, `max_number`, `pay_type`, `pay_amount`, `status`, `desc`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#Activity.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("clubId", "#Activity.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("initiatorId", "#Activity.initiatorId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("activityName", "#Activity.activityName, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("startTime", "#Activity.startTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("endTime", "#Activity.endTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("position", "#Activity.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("maxNumber", "#Activity.maxNumber, javaType=java.lang.Integer, jdbcType=INTEGER}");
		VALUES("payType", "#Activity.payType, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("payAmount", "#Activity.payAmount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("status", "#Activity.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("desc", "#Activity.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("createTime", "#Activity.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#Activity.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		Activity activity = (Activity) parameters.get("Activity");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(activity.getId() != null) {
			SET("id = #{Activity.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getClubId() != null) {
			SET("clubId = #{Activity.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getInitiatorId() != null) {
			SET("initiatorId = #{Activity.initiatorId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getActivityName() != null) {
			SET("activityName = #{Activity.activityName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getStartTime() != null) {
			SET("startTime = #{Activity.startTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getEndTime() != null) {
			SET("endTime = #{Activity.endTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getPosition() != null) {
			SET("position = #{Activity.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getMaxNumber() != null) {
			SET("maxNumber = #{Activity.maxNumber, javaType=java.lang.Integer, jdbcType=INTEGER}");
		}
		if(activity.getPayType() != null) {
			SET("payType = #{Activity.payType, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(activity.getPayAmount() != null) {
			SET("payAmount = #{Activity.payAmount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getStatus() != null) {
			SET("status = #{Activity.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(activity.getDesc() != null) {
			SET("desc = #{Activity.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getCreateTime() != null) {
			SET("createTime = #{Activity.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getUpdateTime() != null) {
			SET("updateTime = #{Activity.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{Activity.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{Activity.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		Activity activity = (Activity) parameters.get("Activity");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(activity.getId() != null) {
			WHERE("id = #{Activity.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getClubId() != null) {
			WHERE("clubId = #{Activity.clubId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getInitiatorId() != null) {
			WHERE("initiatorId = #{Activity.initiatorId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getActivityName() != null) {
			WHERE("activityName = #{Activity.activityName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getStartTime() != null) {
			WHERE("startTime = #{Activity.startTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getEndTime() != null) {
			WHERE("endTime = #{Activity.endTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getPosition() != null) {
			WHERE("position = #{Activity.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getMaxNumber() != null) {
			WHERE("maxNumber = #{Activity.maxNumber, javaType=java.lang.Integer, jdbcType=INTEGER}");
		}
		if(activity.getPayType() != null) {
			WHERE("payType = #{Activity.payType, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(activity.getPayAmount() != null) {
			WHERE("payAmount = #{Activity.payAmount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(activity.getStatus() != null) {
			WHERE("status = #{Activity.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(activity.getDesc() != null) {
			WHERE("desc = #{Activity.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(activity.getCreateTime() != null) {
			WHERE("createTime = #{Activity.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(activity.getUpdateTime() != null) {
			WHERE("updateTime = #{Activity.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
