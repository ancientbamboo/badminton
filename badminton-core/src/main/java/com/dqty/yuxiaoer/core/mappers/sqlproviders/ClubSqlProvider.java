

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
import com.dqty.yuxiaoer.core.domains.Club;
public class ClubSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "club";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `full_name`, `short_name`, `position`, `president_name`, `president_tel`, `club_qq_groups`, `club_site`, `consume_mode`, `source`, `status`, `desc`, `robot_info`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#Club.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("fullName", "#Club.fullName, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("shortName", "#Club.shortName, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("position", "#Club.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("presidentName", "#Club.presidentName, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("presidentTel", "#Club.presidentTel, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("clubQqGroups", "#Club.clubQqGroups, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("clubSite", "#Club.clubSite, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("consumeMode", "#Club.consumeMode, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("source", "#Club.source, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("status", "#Club.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("desc", "#Club.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("robotInfo", "#Club.robotInfo, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("createTime", "#Club.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#Club.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		Club club = (Club) parameters.get("Club");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(club.getId() != null) {
			SET("id = #{Club.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(club.getFullName() != null) {
			SET("fullName = #{Club.fullName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getShortName() != null) {
			SET("shortName = #{Club.shortName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPosition() != null) {
			SET("position = #{Club.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPresidentName() != null) {
			SET("presidentName = #{Club.presidentName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPresidentTel() != null) {
			SET("presidentTel = #{Club.presidentTel, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getClubQqGroups() != null) {
			SET("clubQqGroups = #{Club.clubQqGroups, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getClubSite() != null) {
			SET("clubSite = #{Club.clubSite, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getConsumeMode() != null) {
			SET("consumeMode = #{Club.consumeMode, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getSource() != null) {
			SET("source = #{Club.source, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getStatus() != null) {
			SET("status = #{Club.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getDesc() != null) {
			SET("desc = #{Club.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getRobotInfo() != null) {
			SET("robotInfo = #{Club.robotInfo, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getCreateTime() != null) {
			SET("createTime = #{Club.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(club.getUpdateTime() != null) {
			SET("updateTime = #{Club.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{Club.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{Club.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		Club club = (Club) parameters.get("Club");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(club.getId() != null) {
			WHERE("id = #{Club.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(club.getFullName() != null) {
			WHERE("fullName = #{Club.fullName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getShortName() != null) {
			WHERE("shortName = #{Club.shortName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPosition() != null) {
			WHERE("position = #{Club.position, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPresidentName() != null) {
			WHERE("presidentName = #{Club.presidentName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getPresidentTel() != null) {
			WHERE("presidentTel = #{Club.presidentTel, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getClubQqGroups() != null) {
			WHERE("clubQqGroups = #{Club.clubQqGroups, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getClubSite() != null) {
			WHERE("clubSite = #{Club.clubSite, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getConsumeMode() != null) {
			WHERE("consumeMode = #{Club.consumeMode, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getSource() != null) {
			WHERE("source = #{Club.source, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getStatus() != null) {
			WHERE("status = #{Club.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(club.getDesc() != null) {
			WHERE("desc = #{Club.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getRobotInfo() != null) {
			WHERE("robotInfo = #{Club.robotInfo, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(club.getCreateTime() != null) {
			WHERE("createTime = #{Club.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(club.getUpdateTime() != null) {
			WHERE("updateTime = #{Club.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
