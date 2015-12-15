

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
import com.dqty.yuxiaoer.core.domains.AccoutBalanceDetail;
public class AccoutBalanceDetailSqlProvider {
	/**
	 * 数据表名
	 */
	private static final String TABLE_NAME = "accout_balance_detail";
	/**
	 * 表对应的所有字段
	 */
	private static final String TABLE_ALL_FIELD = "`id`, `user_id`, `account_id`, `subject_id`, `amount`, `type`, `balance`, `create_time`, `update_time`";

	/**
	 * 数据表插入方法
	 */
	public String insert(){
		BEGIN();
		INSERT_INTO(TABLE_NAME);
		VALUES("id", "#AccoutBalanceDetail.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("userId", "#AccoutBalanceDetail.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("accountId", "#AccoutBalanceDetail.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("subjectId", "#AccoutBalanceDetail.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("amount", "#AccoutBalanceDetail.amount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("type", "#AccoutBalanceDetail.type, javaType=java.lang.Integer, jdbcType=TINYINT}");
		VALUES("balance", "#AccoutBalanceDetail.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		VALUES("createTime", "#AccoutBalanceDetail.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		VALUES("updateTime", "#AccoutBalanceDetail.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		return SQL();
	}

	/**
	 * 数据表更新方法：只按数据表的主键方式更新
	 */
	public String update(Map<String, Object> parameters){
		AccoutBalanceDetail accoutBalanceDetail = (AccoutBalanceDetail) parameters.get("AccoutBalanceDetail");
		BEGIN();
		UPDATE(TABLE_NAME);
		if(accoutBalanceDetail.getId() != null) {
			SET("id = #{AccoutBalanceDetail.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getUserId() != null) {
			SET("userId = #{AccoutBalanceDetail.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getAccountId() != null) {
			SET("accountId = #{AccoutBalanceDetail.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getSubjectId() != null) {
			SET("subjectId = #{AccoutBalanceDetail.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalanceDetail.getAmount() != null) {
			SET("amount = #{AccoutBalanceDetail.amount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getType() != null) {
			SET("type = #{AccoutBalanceDetail.type, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalanceDetail.getBalance() != null) {
			SET("balance = #{AccoutBalanceDetail.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getCreateTime() != null) {
			SET("createTime = #{AccoutBalanceDetail.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(accoutBalanceDetail.getUpdateTime() != null) {
			SET("updateTime = #{AccoutBalanceDetail.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		WHERE("id = #{AccoutBalanceDetail.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表删除方法：只按数据表的主键方式删除
	 */
	public String delete(Map<String, Object> parameters){
		BEGIN();
		DELETE_FROM(TABLE_NAME);
		WHERE("id = #{AccoutBalanceDetail.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");

		return SQL();
	}

	/**
	 * 数据表查询方法：只按数据表对象属性不为空时进行查询，多条件时为AND连接
	 */
	public String select(Map<String, Object> parameters){
		AccoutBalanceDetail accoutBalanceDetail = (AccoutBalanceDetail) parameters.get("AccoutBalanceDetail");
		BEGIN();
		SELECT(TABLE_ALL_FIELD);
		FROM(TABLE_NAME);
		if(accoutBalanceDetail.getId() != null) {
			WHERE("id = #{AccoutBalanceDetail.id, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getUserId() != null) {
			WHERE("userId = #{AccoutBalanceDetail.userId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getAccountId() != null) {
			WHERE("accountId = #{AccoutBalanceDetail.accountId, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getSubjectId() != null) {
			WHERE("subjectId = #{AccoutBalanceDetail.subjectId, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalanceDetail.getAmount() != null) {
			WHERE("amount = #{AccoutBalanceDetail.amount, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getType() != null) {
			WHERE("type = #{AccoutBalanceDetail.type, javaType=java.lang.Integer, jdbcType=TINYINT}");
		}
		if(accoutBalanceDetail.getBalance() != null) {
			WHERE("balance = #{AccoutBalanceDetail.balance, javaType=java.math.BigInteger, jdbcType=BIGINT}");
		}
		if(accoutBalanceDetail.getCreateTime() != null) {
			WHERE("createTime = #{AccoutBalanceDetail.createTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		if(accoutBalanceDetail.getUpdateTime() != null) {
			WHERE("updateTime = #{AccoutBalanceDetail.updateTime, javaType=java.util.Date, jdbcType=TIMESTAMP}");
		}
		return SQL();
	}

}
