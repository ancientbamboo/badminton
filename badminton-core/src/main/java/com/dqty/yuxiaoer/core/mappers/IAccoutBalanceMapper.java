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
import com.dqty.yuxiaoer.core.domains.AccoutBalance;
import com.dqty.yuxiaoer.core.mappers.sqlproviders.AccoutBalanceSqlProvider;

/**
 * @author 王照瑞
 */
public interface IAccoutBalanceMapper {
	@InsertProvider(type = AccoutBalanceSqlProvider.class, method = "insert")
	public void insert(@Param("AccoutBalance")AccoutBalance accoutBalance);

	@UpdateProvider(type = AccoutBalanceSqlProvider.class, method = "update")
	public void update(@Param("AccoutBalance")AccoutBalance accoutBalance);

	@DeleteProvider(type = AccoutBalanceSqlProvider.class, method = "delete")
	public void delete(@Param("AccoutBalance")AccoutBalance accoutBalance);

	@SelectProvider(type = AccoutBalanceSqlProvider.class, method = "select")
	@Results(value = {
			@Result(column = "id", property = "id", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "userId", property = "userId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "accountId", property = "accountId", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "subjectId", property = "subjectId", javaType = java.lang.Integer.class, jdbcType = JdbcType.TINYINT),
			@Result(column = "balance", property = "balance", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "freezeBalance", property = "freezeBalance", javaType = java.math.BigInteger.class, jdbcType = JdbcType.BIGINT),
			@Result(column = "createTime", property = "createTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updateTime", property = "updateTime", javaType = java.util.Date.class, jdbcType = JdbcType.TIMESTAMP),
	})
	public List<AccoutBalance> select(@Param("AccoutBalance")AccoutBalance accoutBalance);

}
