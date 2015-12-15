

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
import com.dqty.yuxiaoer.core.domains.AccoutBalance;
public class AccoutBalanceSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "accout_balance";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `account_id`, `subject_id`, `balance`, `freeze_balance`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#AccoutBalance.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#AccoutBalance.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("accountId", "#AccoutBalance.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("subjectId", "#AccoutBalance.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("balance", "#AccoutBalance.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("freezeBalance", "#AccoutBalance.freezeBalance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("createTime", "#AccoutBalance.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#AccoutBalance.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		AccoutBalance accoutBalance = (AccoutBalance) parameters.get("AccoutBalance");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(accoutBalance.getId() != null) {
			SET("id = #{AccoutBalance.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getUserId() != null) {
			SET("userId = #{AccoutBalance.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getAccountId() != null) {
			SET("accountId = #{AccoutBalance.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getSubjectId() != null) {
			SET("subjectId = #{AccoutBalance.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalance.getBalance() != null) {
			SET("balance = #{AccoutBalance.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getFreezeBalance() != null) {
			SET("freezeBalance = #{AccoutBalance.freezeBalance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getCreateTime() != null) {
			SET("createTime = #{AccoutBalance.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(accoutBalance.getUpdateTime() != null) {
			SET("updateTime = #{AccoutBalance.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{AccoutBalance.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{AccoutBalance.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		AccoutBalance accoutBalance = (AccoutBalance) parameters.get("AccoutBalance");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(accoutBalance.getId() != null) {
			WHERE("id = #{AccoutBalance.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getUserId() != null) {
			WHERE("userId = #{AccoutBalance.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getAccountId() != null) {
			WHERE("accountId = #{AccoutBalance.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getSubjectId() != null) {
			WHERE("subjectId = #{AccoutBalance.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalance.getBalance() != null) {
			WHERE("balance = #{AccoutBalance.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getFreezeBalance() != null) {
			WHERE("freezeBalance = #{AccoutBalance.freezeBalance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalance.getCreateTime() != null) {
			WHERE("createTime = #{AccoutBalance.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(accoutBalance.getUpdateTime() != null) {
			WHERE("updateTime = #{AccoutBalance.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
