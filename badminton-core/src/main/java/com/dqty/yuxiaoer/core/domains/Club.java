package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class Club implements Serializable {
	private static final long serialVersionUID = 8329712133236881295L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 俱乐部全称
	 */
	private java.lang.String fullName = null;
	/**
	 * 俱乐部简称
	 */
	private java.lang.String shortName = null;
	/**
	 * 俱乐部所在地
	 */
	private java.lang.String position = null;
	/**
	 * 俱乐部会长名称
	 */
	private java.lang.String presidentName = null;
	/**
	 * 俱乐部会长电话
	 */
	private java.lang.String presidentTel = null;
	/**
	 * 俱乐部qq群
	 */
	private java.lang.Integer clubQqGroups = null;
	/**
	 * 俱乐部活动场地
	 */
	private java.lang.String clubSite = null;
	/**
	 * 消费模式 0：预交模式 1：现场缴纳
	 */
	private java.lang.Integer consumeMode = null;
	/**
	 * 信息来源 0：邮件 1：微信  2:微博    3:论坛帖子　　　 4:其他俱乐部介绍  5:网站搜索　　　 6:会员介绍  7:其他 \r
	 */
	private java.lang.Integer source = null;
	/**
	 * 0:申请中    1:正常       2:无效
	 */
	private java.lang.Integer status = null;
	/**
	 * 俱乐部简介
	 */
	private java.lang.String desc = null;
	/**
	 * 机器人应答设置
	 */
	private java.lang.String robotInfo = null;
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
	 * 俱乐部全称
	 * @param fullName
	 */
	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 俱乐部全称
	 * @return
	 */
	public java.lang.String getFullName() {
		return fullName;
	}

	/**
	 * 俱乐部简称
	 * @param shortName
	 */
	public void setShortName(java.lang.String shortName) {
		this.shortName = shortName;
	}
	/**
	 * 俱乐部简称
	 * @return
	 */
	public java.lang.String getShortName() {
		return shortName;
	}

	/**
	 * 俱乐部所在地
	 * @param position
	 */
	public void setPosition(java.lang.String position) {
		this.position = position;
	}
	/**
	 * 俱乐部所在地
	 * @return
	 */
	public java.lang.String getPosition() {
		return position;
	}

	/**
	 * 俱乐部会长名称
	 * @param presidentName
	 */
	public void setPresidentName(java.lang.String presidentName) {
		this.presidentName = presidentName;
	}
	/**
	 * 俱乐部会长名称
	 * @return
	 */
	public java.lang.String getPresidentName() {
		return presidentName;
	}

	/**
	 * 俱乐部会长电话
	 * @param presidentTel
	 */
	public void setPresidentTel(java.lang.String presidentTel) {
		this.presidentTel = presidentTel;
	}
	/**
	 * 俱乐部会长电话
	 * @return
	 */
	public java.lang.String getPresidentTel() {
		return presidentTel;
	}

	/**
	 * 俱乐部qq群
	 * @param clubQqGroups
	 */
	public void setClubQqGroups(java.lang.Integer clubQqGroups) {
		this.clubQqGroups = clubQqGroups;
	}
	/**
	 * 俱乐部qq群
	 * @return
	 */
	public java.lang.Integer getClubQqGroups() {
		return clubQqGroups;
	}

	/**
	 * 俱乐部活动场地
	 * @param clubSite
	 */
	public void setClubSite(java.lang.String clubSite) {
		this.clubSite = clubSite;
	}
	/**
	 * 俱乐部活动场地
	 * @return
	 */
	public java.lang.String getClubSite() {
		return clubSite;
	}

	/**
	 * 消费模式 0：预交模式 1：现场缴纳
	 * @param consumeMode
	 */
	public void setConsumeMode(java.lang.Integer consumeMode) {
		this.consumeMode = consumeMode;
	}
	/**
	 * 消费模式 0：预交模式 1：现场缴纳
	 * @return
	 */
	public java.lang.Integer getConsumeMode() {
		return consumeMode;
	}

	/**
	 * 信息来源 0：邮件 1：微信  2:微博    3:论坛帖子　　　 4:其他俱乐部介绍  5:网站搜索　　　 6:会员介绍  7:其他 \r
	 * @param source
	 */
	public void setSource(java.lang.Integer source) {
		this.source = source;
	}
	/**
	 * 信息来源 0：邮件 1：微信  2:微博    3:论坛帖子　　　 4:其他俱乐部介绍  5:网站搜索　　　 6:会员介绍  7:其他 \r
	 * @return
	 */
	public java.lang.Integer getSource() {
		return source;
	}

	/**
	 * 0:申请中    1:正常       2:无效
	 * @param status
	 */
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	/**
	 * 0:申请中    1:正常       2:无效
	 * @return
	 */
	public java.lang.Integer getStatus() {
		return status;
	}

	/**
	 * 俱乐部简介
	 * @param desc
	 */
	public void setDesc(java.lang.String desc) {
		this.desc = desc;
	}
	/**
	 * 俱乐部简介
	 * @return
	 */
	public java.lang.String getDesc() {
		return desc;
	}

	/**
	 * 机器人应答设置
	 * @param robotInfo
	 */
	public void setRobotInfo(java.lang.String robotInfo) {
		this.robotInfo = robotInfo;
	}
	/**
	 * 机器人应答设置
	 * @return
	 */
	public java.lang.String getRobotInfo() {
		return robotInfo;
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
		result = prime * result + ((this.fullName == null) ? 0 : this.fullName.hashCode());
		result = prime * result + ((this.shortName == null) ? 0 : this.shortName.hashCode());
		result = prime * result + ((this.position == null) ? 0 : this.position.hashCode());
		result = prime * result + ((this.presidentName == null) ? 0 : this.presidentName.hashCode());
		result = prime * result + ((this.presidentTel == null) ? 0 : this.presidentTel.hashCode());
		result = prime * result + ((this.clubQqGroups == null) ? 0 : this.clubQqGroups.hashCode());
		result = prime * result + ((this.clubSite == null) ? 0 : this.clubSite.hashCode());
		result = prime * result + ((this.consumeMode == null) ? 0 : this.consumeMode.hashCode());
		result = prime * result + ((this.source == null) ? 0 : this.source.hashCode());
		result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
		result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
		result = prime * result + ((this.robotInfo == null) ? 0 : this.robotInfo.hashCode());
		result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
		result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Club other = (Club) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (fullName == null) {
			if (other.fullName != null) return false;
		} else if (!fullName.equals(other.fullName)) return false;
		if (shortName == null) {
			if (other.shortName != null) return false;
		} else if (!shortName.equals(other.shortName)) return false;
		if (position == null) {
			if (other.position != null) return false;
		} else if (!position.equals(other.position)) return false;
		if (presidentName == null) {
			if (other.presidentName != null) return false;
		} else if (!presidentName.equals(other.presidentName)) return false;
		if (presidentTel == null) {
			if (other.presidentTel != null) return false;
		} else if (!presidentTel.equals(other.presidentTel)) return false;
		if (clubQqGroups == null) {
			if (other.clubQqGroups != null) return false;
		} else if (!clubQqGroups.equals(other.clubQqGroups)) return false;
		if (clubSite == null) {
			if (other.clubSite != null) return false;
		} else if (!clubSite.equals(other.clubSite)) return false;
		if (consumeMode == null) {
			if (other.consumeMode != null) return false;
		} else if (!consumeMode.equals(other.consumeMode)) return false;
		if (source == null) {
			if (other.source != null) return false;
		} else if (!source.equals(other.source)) return false;
		if (status == null) {
			if (other.status != null) return false;
		} else if (!status.equals(other.status)) return false;
		if (desc == null) {
			if (other.desc != null) return false;
		} else if (!desc.equals(other.desc)) return false;
		if (robotInfo == null) {
			if (other.robotInfo != null) return false;
		} else if (!robotInfo.equals(other.robotInfo)) return false;
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
		return "Club [id=" + id + ", fullName=" + fullName + ", shortName=" + shortName + ", position=" + position + ", presidentName=" + presidentName + ", presidentTel=" + presidentTel + ", clubQqGroups=" + clubQqGroups + ", clubSite=" + clubSite + ", consumeMode=" + consumeMode + ", source=" + source + ", status=" + status + ", desc=" + desc + ", robotInfo=" + robotInfo + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
