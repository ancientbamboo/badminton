package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class UserClubInfo implements Serializable {
	private static final long serialVersionUID = 1758440769697591815L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 用户id
	 */
	private java.math.BigInteger userId = null;
	/**
	 * 俱乐部id
	 */
	private java.math.BigInteger clubId = null;
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
	 * 俱乐部id
	 * @param clubId
	 */
	public void setClubId(java.math.BigInteger clubId) {
		this.clubId = clubId;
	}
	/**
	 * 俱乐部id
	 * @return
	 */
	public java.math.BigInteger getClubId() {
		return clubId;
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
		result = prime * result + ((this.clubId == null) ? 0 : this.clubId.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserClubInfo other = (UserClubInfo) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (userId == null) {
			if (other.userId != null) return false;
		} else if (!userId.equals(other.userId)) return false;
		if (clubId == null) {
			if (other.clubId != null) return false;
		} else if (!clubId.equals(other.clubId)) return false;
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
		return "UserClubInfo [id=" + id + ", userId=" + userId + ", clubId=" + clubId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
