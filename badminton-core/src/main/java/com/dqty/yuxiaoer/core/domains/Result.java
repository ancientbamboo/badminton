package com.dqty.yuxiaoer.core.domains;

/**
 * 业务处理结果类
 * @author 王照瑞
 */
public class Result<T extends Object> {
	private boolean success;// 操作 是否成功
	private String message;// 返回消息
	private T data;// 返回附加信息 可以是String、List、JSON、Map 类型

	public Result(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	public Result(boolean success) {
		this.success = success;
		if (success) {
			this.setMessage("操作成功");// 操作成功
		} else {
			this.setMessage("操作失败");// 操作失败
		}
	}

	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public Result(boolean success, String message, T data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
