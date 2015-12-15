/**
 * 
 */
package com.dqty.yuxiaoer.rest.domains;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王照瑞
 *
 */
public class RestResult<T extends Object> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1197366671688491890L;
	private boolean rlt;// 操作 是否成功 true成功 false失败
	private String msg;
	private List<T> data;
	
	public RestResult() {
		this.rlt = false;
		this.msg = "默认值：操作失败";
	}

	public RestResult(boolean success, List<T> data) {
		super();
		this.rlt = success;
		this.data = data;
	}

	public RestResult(boolean success) {
		this.rlt = success;
		if (success) {
			this.setMsg("操作成功");// 操作成功
		} else {
			this.setMsg("操作失败");// 操作失败
		}
	}

	public RestResult(boolean success, String message) {
		super();
		this.rlt = success;
		this.msg = message;
	}

	public RestResult(boolean success, String message, List<T> data) {
		super();
		this.rlt = success;
		this.msg = message;
		this.data = data;
	}

	public boolean isRlt() {
		return rlt;
	}

	public void setRlt(boolean rlt) {
		this.rlt = rlt;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + (rlt ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestResult<?> other = (RestResult<?>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (rlt != other.rlt)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RestResult [rlt=" + rlt + ", msg=" + msg + ", data=" + data + "]";
	}

}
