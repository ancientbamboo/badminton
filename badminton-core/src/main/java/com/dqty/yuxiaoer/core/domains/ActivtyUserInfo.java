package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class ActivtyUserInfo implements Serializable {
	private static final long serialVersionUID = 5038125634923142629L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 用户id
	 */
	private java.math.BigInteger userId = null;
	/**
	 * 活动id
	 */
	private java.math.BigInteger activityId = null;
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
	 * 活动id
	 * @param activityId
	 */
	public void setActivityId(java.math.BigInteger activityId) {
		this.activityId = activityId;
	}
	/**
	 * 活动id
	 * @return
	 */
	public java.math.BigInteger getActivityId() {
		return activityId;
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
		result = prime * result + ((this.activityId == null) ? 0 : this.activityId.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ActivtyUserInfo other = (ActivtyUserInfo) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (userId == null) {
			if (other.userId != null) return false;
		} else if (!userId.equals(other.userId)) return false;
		if (activityId == null) {
			if (other.activityId != null) return false;
		} else if (!activityId.equals(other.activityId)) return false;
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
		return "ActivtyUserInfo [id=" + id + ", userId=" + userId + ", activityId=" + activityId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
