package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class Activity implements Serializable {
	private static final long serialVersionUID = 7143283936059852208L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 俱乐部id
	 */
	private java.math.BigInteger clubId = null;
	/**
	 * 发起人
	 */
	private java.math.BigInteger initiatorId = null;
	/**
	 * 活动名称
	 */
	private java.lang.String activityName = null;
	/**
	 * 开始时间
	 */
	private java.util.Date startTime = null;
	/**
	 * 结束时间
	 */
	private java.util.Date endTime = null;
	/**
	 * 活动位置
	 */
	private java.lang.String position = null;
	/**
	 * 最大人数
	 */
	private java.lang.Integer maxNumber = null;
	/**
	 * 付款方式
	 */
	private java.lang.Integer payType = null;
	/**
	 * 付款金额
	 */
	private java.math.BigInteger payAmount = null;
	/**
	 * 活动状态 0: 有效 1:无效 
	 */
	private java.lang.Integer status = null;
	/**
	 * 活动描述
	 */
	private java.lang.String desc = null;
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
	 * 发起人
	 * @param initiatorId
	 */
	public void setInitiatorId(java.math.BigInteger initiatorId) {
		this.initiatorId = initiatorId;
	}
	/**
	 * 发起人
	 * @return
	 */
	public java.math.BigInteger getInitiatorId() {
		return initiatorId;
	}

	/**
	 * 活动名称
	 * @param activityName
	 */
	public void setActivityName(java.lang.String activityName) {
		this.activityName = activityName;
	}
	/**
	 * 活动名称
	 * @return
	 */
	public java.lang.String getActivityName() {
		return activityName;
	}

	/**
	 * 开始时间
	 * @param startTime
	 */
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 开始时间
	 * @return
	 */
	public java.util.Date getStartTime() {
		return startTime;
	}

	/**
	 * 结束时间
	 * @param endTime
	 */
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 结束时间
	 * @return
	 */
	public java.util.Date getEndTime() {
		return endTime;
	}

	/**
	 * 活动位置
	 * @param position
	 */
	public void setPosition(java.lang.String position) {
		this.position = position;
	}
	/**
	 * 活动位置
	 * @return
	 */
	public java.lang.String getPosition() {
		return position;
	}

	/**
	 * 最大人数
	 * @param maxNumber
	 */
	public void setMaxNumber(java.lang.Integer maxNumber) {
		this.maxNumber = maxNumber;
	}
	/**
	 * 最大人数
	 * @return
	 */
	public java.lang.Integer getMaxNumber() {
		return maxNumber;
	}

	/**
	 * 付款方式
	 * @param payType
	 */
	public void setPayType(java.lang.Integer payType) {
		this.payType = payType;
	}
	/**
	 * 付款方式
	 * @return
	 */
	public java.lang.Integer getPayType() {
		return payType;
	}

	/**
	 * 付款金额
	 * @param payAmount
	 */
	public void setPayAmount(java.math.BigInteger payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * 付款金额
	 * @return
	 */
	public java.math.BigInteger getPayAmount() {
		return payAmount;
	}

	/**
	 * 活动状态 0: 有效 1:无效 
	 * @param status
	 */
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	/**
	 * 活动状态 0: 有效 1:无效 
	 * @return
	 */
	public java.lang.Integer getStatus() {
		return status;
	}

	/**
	 * 活动描述
	 * @param desc
	 */
	public void setDesc(java.lang.String desc) {
		this.desc = desc;
	}
	/**
	 * 活动描述
	 * @return
	 */
	public java.lang.String getDesc() {
		return desc;
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
		result = prime * result + ((this.clubId == null) ? 0 : this.clubId.hashCode());
		result = prime * result + ((this.initiatorId == null) ? 0 : this.initiatorId.hashCode());
		result = prime * result + ((this.activityName == null) ? 0 : this.activityName.hashCode());
		result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
		result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
		result = prime * result + ((this.position == null) ? 0 : this.position.hashCode());
		result = prime * result + ((this.maxNumber == null) ? 0 : this.maxNumber.hashCode());
		result = prime * result + ((this.payType == null) ? 0 : this.payType.hashCode());
		result = prime * result + ((this.payAmount == null) ? 0 : this.payAmount.hashCode());
		result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
		result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Activity other = (Activity) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (clubId == null) {
			if (other.clubId != null) return false;
		} else if (!clubId.equals(other.clubId)) return false;
		if (initiatorId == null) {
			if (other.initiatorId != null) return false;
		} else if (!initiatorId.equals(other.initiatorId)) return false;
		if (activityName == null) {
			if (other.activityName != null) return false;
		} else if (!activityName.equals(other.activityName)) return false;
		if (startTime == null) {
			if (other.startTime != null) return false;
		} else if (!startTime.equals(other.startTime)) return false;
		if (endTime == null) {
			if (other.endTime != null) return false;
		} else if (!endTime.equals(other.endTime)) return false;
		if (position == null) {
			if (other.position != null) return false;
		} else if (!position.equals(other.position)) return false;
		if (maxNumber == null) {
			if (other.maxNumber != null) return false;
		} else if (!maxNumber.equals(other.maxNumber)) return false;
		if (payType == null) {
			if (other.payType != null) return false;
		} else if (!payType.equals(other.payType)) return false;
		if (payAmount == null) {
			if (other.payAmount != null) return false;
		} else if (!payAmount.equals(other.payAmount)) return false;
		if (status == null) {
			if (other.status != null) return false;
		} else if (!status.equals(other.status)) return false;
		if (desc == null) {
			if (other.desc != null) return false;
		} else if (!desc.equals(other.desc)) return false;
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
		return "Activity [id=" + id + ", clubId=" + clubId + ", initiatorId=" + initiatorId + ", activityName=" + activityName + ", startTime=" + startTime + ", endTime=" + endTime + ", position=" + position + ", maxNumber=" + maxNumber + ", payType=" + payType + ", payAmount=" + payAmount + ", status=" + status + ", desc=" + desc + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
