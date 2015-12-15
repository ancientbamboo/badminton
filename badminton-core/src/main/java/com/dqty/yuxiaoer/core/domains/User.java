package com.dqty.yuxiaoer.core.domains;

import java.io.Serializable;

/**
 * @author 王照瑞
 */
public class User implements Serializable {
	private static final long serialVersionUID = -5428987586510892750L;
	/**
	 * 主键
	 */
	private java.math.BigInteger id = null;
	/**
	 * 用户id
	 */
	private java.math.BigInteger userId = null;
	/**
	 * 用户昵称
	 */
	private java.lang.String nickName = null;
	/**
	 * 用户密码
	 */
	private java.lang.String passWd = null;
	/**
	 * 手机号码
	 */
	private java.lang.String tel = null;
	/**
	 * 头像URL
	 */
	private java.lang.String avatarUrl = null;
	/**
	 * 性别
	 */
	private java.lang.Integer gender = null;
	/**
	 * 生日
	 */
	private java.lang.String birthday = null;
	/**
	 * 邮箱
	 */
	private java.lang.String email = null;
	/**
	 * 球龄
	 */
	private java.util.Date playAge = null;
	/**
	 * 用户等级
	 */
	private java.lang.Integer userLevel = null;
	/**
	 * 用户状态
	 */
	private java.lang.Integer status = null;
	/**
	 * 简介
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
	 * 用户昵称
	 * @param nickName
	 */
	public void setNickName(java.lang.String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 用户昵称
	 * @return
	 */
	public java.lang.String getNickName() {
		return nickName;
	}

	/**
	 * 用户密码
	 * @param passWd
	 */
	public void setPassWd(java.lang.String passWd) {
		this.passWd = passWd;
	}
	/**
	 * 用户密码
	 * @return
	 */
	public java.lang.String getPassWd() {
		return passWd;
	}

	/**
	 * 手机号码
	 * @param tel
	 */
	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}
	/**
	 * 手机号码
	 * @return
	 */
	public java.lang.String getTel() {
		return tel;
	}

	/**
	 * 头像URL
	 * @param avatarUrl
	 */
	public void setAvatarUrl(java.lang.String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * 头像URL
	 * @return
	 */
	public java.lang.String getAvatarUrl() {
		return avatarUrl;
	}

	/**
	 * 性别
	 * @param gender
	 */
	public void setGender(java.lang.Integer gender) {
		this.gender = gender;
	}
	/**
	 * 性别
	 * @return
	 */
	public java.lang.Integer getGender() {
		return gender;
	}

	/**
	 * 生日
	 * @param birthday
	 */
	public void setBirthday(java.lang.String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 生日
	 * @return
	 */
	public java.lang.String getBirthday() {
		return birthday;
	}

	/**
	 * 邮箱
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}
	/**
	 * 邮箱
	 * @return
	 */
	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * 球龄
	 * @param playAge
	 */
	public void setPlayAge(java.util.Date playAge) {
		this.playAge = playAge;
	}
	/**
	 * 球龄
	 * @return
	 */
	public java.util.Date getPlayAge() {
		return playAge;
	}

	/**
	 * 用户等级
	 * @param userLevel
	 */
	public void setUserLevel(java.lang.Integer userLevel) {
		this.userLevel = userLevel;
	}
	/**
	 * 用户等级
	 * @return
	 */
	public java.lang.Integer getUserLevel() {
		return userLevel;
	}

	/**
	 * 用户状态
	 * @param status
	 */
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}
	/**
	 * 用户状态
	 * @return
	 */
	public java.lang.Integer getStatus() {
		return status;
	}

	/**
	 * 简介
	 * @param desc
	 */
	public void setDesc(java.lang.String desc) {
		this.desc = desc;
	}
	/**
	 * 简介
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
		result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
		result = prime * result + ((this.nickName == null) ? 0 : this.nickName.hashCode());
		result = prime * result + ((this.passWd == null) ? 0 : this.passWd.hashCode());
		result = prime * result + ((this.tel == null) ? 0 : this.tel.hashCode());
		result = prime * result + ((this.avatarUrl == null) ? 0 : this.avatarUrl.hashCode());
		result = prime * result + ((this.gender == null) ? 0 : this.gender.hashCode());
		result = prime * result + ((this.birthday == null) ? 0 : this.birthday.hashCode());
		result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
		result = prime * result + ((this.playAge == null) ? 0 : this.playAge.hashCode());
		result = prime * result + ((this.userLevel == null) ? 0 : this.userLevel.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null) return false;
		} else if (!id.equals(other.id)) return false;
		if (userId == null) {
			if (other.userId != null) return false;
		} else if (!userId.equals(other.userId)) return false;
		if (nickName == null) {
			if (other.nickName != null) return false;
		} else if (!nickName.equals(other.nickName)) return false;
		if (passWd == null) {
			if (other.passWd != null) return false;
		} else if (!passWd.equals(other.passWd)) return false;
		if (tel == null) {
			if (other.tel != null) return false;
		} else if (!tel.equals(other.tel)) return false;
		if (avatarUrl == null) {
			if (other.avatarUrl != null) return false;
		} else if (!avatarUrl.equals(other.avatarUrl)) return false;
		if (gender == null) {
			if (other.gender != null) return false;
		} else if (!gender.equals(other.gender)) return false;
		if (birthday == null) {
			if (other.birthday != null) return false;
		} else if (!birthday.equals(other.birthday)) return false;
		if (email == null) {
			if (other.email != null) return false;
		} else if (!email.equals(other.email)) return false;
		if (playAge == null) {
			if (other.playAge != null) return false;
		} else if (!playAge.equals(other.playAge)) return false;
		if (userLevel == null) {
			if (other.userLevel != null) return false;
		} else if (!userLevel.equals(other.userLevel)) return false;
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
		return "User [id=" + id + ", userId=" + userId + ", nickName=" + nickName + ", passWd=" + passWd + ", tel=" + tel + ", avatarUrl=" + avatarUrl + ", gender=" + gender + ", birthday=" + birthday + ", email=" + email + ", playAge=" + playAge + ", userLevel=" + userLevel + ", status=" + status + ", desc=" + desc + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
