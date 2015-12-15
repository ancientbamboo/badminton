package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class AccoutBalanceDetail implements Serializable {
	private static final long serialVersionUID = -6378087361421852223L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 用户id
	 */
	private java.math.BigInteger userId = null;
	/**
	 * 用户账户id
	 */
	private java.math.BigInteger accountId = null;
	/**
	 * 账户科目
	 */
	private java.lang.Integer subjectId = null;
	/**
	 * 发生金额（充值+，提现-）
	 */
	private java.math.BigInteger amount = null;
	/**
	 * 业务类型：0: 转账  1：充值 2：提现
	 */
	private java.lang.Integer type = null;
	/**
	 * 账户当前余额
	 */
	private java.math.BigInteger balance = null;
	/**
	 * 创建时间
	 */
	private java.util.Date createTime = null;
	/**
	 * 更新时间
	 */
	private java.util.Date updateTime = null;

	/**
	 * 主键
	 * @param id
	 */
	public void setId(java.math.BigInteger id) {
		this.id = id;
	}
	/**
	 * 主键
	 * @return
	 */
	public java.math.BigInteger getId() {
		return id;
	}

	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(java.math.BigInteger userId) {
		this.userId = userId;
	}
	/**
	 * 用户id
	 * @return
	 */
	public java.math.BigInteger getUserId() {
		return userId;
	}

	/**
	 * 用户账户id
	 * @param accountId
	 */
	public void setAccountId(java.math.BigInteger accountId) {
		this.accountId = accountId;
	}
	/**
	 * 用户账户id
	 * @return
	 */
	public java.math.BigInteger getAccountId() {
		return accountId;
	}

	/**
	 * 账户科目
	 * @param subjectId
	 */
	public void setSubjectId(java.lang.Integer subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 账户科目
	 * @return
	 */
	public java.lang.Integer getSubjectId() {
		return subjectId;
	}

	/**
	 * 发生金额（充值+，提现-）
	 * @param amount
	 */
	public void setAmount(java.math.BigInteger amount) {
		this.amount = amount;
	}
	/**
	 * 发生金额（充值+，提现-）
	 * @return
	 */
	public java.math.BigInteger getAmount() {
		return amount;
	}

	/**
	 * 业务类型：0: 转账  1：充值 2：提现
	 * @param type
	 */
	public void setType(java.lang.Integer type) {
		this.type = type;
	}
	/**
	 * 业务类型：0: 转账  1：充值 2：提现
	 * @return
	 */
	public java.lang.Integer getType() {
		return type;
	}

	/**
	 * 账户当前余额
	 * @param balance
	 */
	public void setBalance(java.math.BigInteger balance) {
		this.balance = balance;
	}
	/**
	 * 账户当前余额
	 * @return
	 */
	public java.math.BigInteger getBalance() {
		return balance;
	}

	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 创建时间
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**
	 * 更新时间
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 更新时间
	 * @return
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
		result = prime * result + ((this.accountId == null) ? 0 : this.accountId.hashCode());
		result = prime * result + ((this.subjectId == null) ? 0 : this.subjectId.hashCode());
		result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		result = prime * result + ((this.balance == null) ? 0 : this.balance.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		AccoutBalanceDetail other = (AccoutBalanceDetail) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (userId == null) {
			if (other.userId != null) return false;
		} else if (!userId.equals(other.userId)) return false;
		if (accountId == null) {
			if (other.accountId != null) return false;
		} else if (!accountId.equals(other.accountId)) return false;
		if (subjectId == null) {
			if (other.subjectId != null) return false;
		} else if (!subjectId.equals(other.subjectId)) return false;
		if (amount == null) {
			if (other.amount != null) return false;
		} else if (!amount.equals(other.amount)) return false;
		if (type == null) {
			if (other.type != null) return false;
		} else if (!type.equals(other.type)) return false;
		if (balance == null) {
			if (other.balance != null) return false;
		} else if (!balance.equals(other.balance)) return false;
		if (createTime == null) {
			if (other.createTime != null) return false;
		} else if (!createTime.equals(other.createTime)) return false;
		if (updateTime == null) {
			if (other.updateTime != null) return false;
		} else if (!updateTime.equals(other.updateTime)) return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccoutBalanceDetail [id=" + id + ", userId=" + userId + ", accountId=" + accountId + ", subjectId=" + subjectId + ", amount=" + amount + ", type=" + type + ", balance=" + balance + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
