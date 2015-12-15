

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
import com.dqty.yuxiaoer.core.domains.User;
public class UserSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "user";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `nick_name`, `pass_wd`, `tel`, `avatar_url`, `gender`, `birthday`, `email`, `play_age`, `user_level`, `status`, `desc`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#User.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#User.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("nickName", "#User.nickName, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("passWd", "#User.passWd, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("tel", "#User.tel, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("avatarUrl", "#User.avatarUrl, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("gender", "#User.gender, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("birthday", "#User.birthday, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("email", "#User.email, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("playAge", "#User.playAge, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("userLevel", "#User.userLevel, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("status", "#User.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("desc", "#User.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		VALUES("createTime", "#User.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#User.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		User user = (User) parameters.get("User");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(user.getId() != null) {
			SET("id = #{User.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(user.getUserId() != null) {
			SET("userId = #{User.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(user.getNickName() != null) {
			SET("nickName = #{User.nickName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getPassWd() != null) {
			SET("passWd = #{User.passWd, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getTel() != null) {
			SET("tel = #{User.tel, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getAvatarUrl() != null) {
			SET("avatarUrl = #{User.avatarUrl, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getGender() != null) {
			SET("gender = #{User.gender, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getBirthday() != null) {
			SET("birthday = #{User.birthday, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getEmail() != null) {
			SET("email = #{User.email, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getPlayAge() != null) {
			SET("playAge = #{User.playAge, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(user.getUserLevel() != null) {
			SET("userLevel = #{User.userLevel, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getStatus() != null) {
			SET("status = #{User.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getDesc() != null) {
			SET("desc = #{User.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getCreateTime() != null) {
			SET("createTime = #{User.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(user.getUpdateTime() != null) {
			SET("updateTime = #{User.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{User.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{User.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		User user = (User) parameters.get("User");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(user.getId() != null) {
			WHERE("id = #{User.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(user.getUserId() != null) {
			WHERE("userId = #{User.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(user.getNickName() != null) {
			WHERE("nickName = #{User.nickName, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getPassWd() != null) {
			WHERE("passWd = #{User.passWd, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getTel() != null) {
			WHERE("tel = #{User.tel, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getAvatarUrl() != null) {
			WHERE("avatarUrl = #{User.avatarUrl, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getGender() != null) {
			WHERE("gender = #{User.gender, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getBirthday() != null) {
			WHERE("birthday = #{User.birthday, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getEmail() != null) {
			WHERE("email = #{User.email, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getPlayAge() != null) {
			WHERE("playAge = #{User.playAge, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(user.getUserLevel() != null) {
			WHERE("userLevel = #{User.userLevel, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getStatus() != null) {
			WHERE("status = #{User.status, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(user.getDesc() != null) {
			WHERE("desc = #{User.desc, javaType=java.lang.String, jdbcType=VARCHAR}");
		}
		if(user.getCreateTime() != null) {
			WHERE("createTime = #{User.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(user.getUpdateTime() != null) {
			WHERE("updateTime = #{User.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
