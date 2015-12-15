package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class UserOpenInfo implements Serializable {
	private static final long serialVersionUID = 6088566301622630404L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 用户id
	 */
	private java.math.BigInteger userId = null;
	/**
	 * 第三方登录方式
	 */
	private java.lang.String openType = null;
	/**
	 * 第三方登录id
	 */
	private java.lang.String openUserId = null;
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
	 * 第三方登录方式
	 * @param openType
	 */
	public void setOpenType(java.lang.String openType) {
		this.openType = openType;
	}
	/**
	 * 第三方登录方式
	 * @return
	 */
	public java.lang.String getOpenType() {
		return openType;
	}

	/**
	 * 第三方登录id
	 * @param openUserId
	 */
	public void setOpenUserId(java.lang.String openUserId) {
		this.openUserId = openUserId;
	}
	/**
	 * 第三方登录id
	 * @return
	 */
	public java.lang.String getOpenUserId() {
		return openUserId;
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
		result = prime * result + ((this.openType == null) ? 0 : this.openType.hashCode());
		result = prime * result + ((this.openUserId == null) ? 0 : this.openUserId.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserOpenInfo other = (UserOpenInfo) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (userId == null) {
			if (other.userId != null) return false;
		} else if (!userId.equals(other.userId)) return false;
		if (openType == null) {
			if (other.openType != null) return false;
		} else if (!openType.equals(other.openType)) return false;
		if (openUserId == null) {
			if (other.openUserId != null) return false;
		} else if (!openUserId.equals(other.openUserId)) return false;
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
		return "UserOpenInfo [id=" + id + ", userId=" + userId + ", openType=" + openType + ", openUserId=" + openUserId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
