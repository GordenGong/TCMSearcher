package core.util;

import java.io.Serializable;

public class WorkoutResult<T> implements Serializable {

	private static final long serialVersionUID = 5713725046751050350L;
	//成功是0，失败是1
	private String state;
	private String message;
	private T data;
	
	public static final String SUCCESS="0";
	public static final String ERROR="1";
	public WorkoutResult() {
		
	}
	//重载构造支持多种复杂情况
	/**
	 * 成功
	 * @param data
	 */
	public WorkoutResult(T data) {
		this.state=SUCCESS;
		this.data=data;
	}
	/**
	 * 失败
	 * @param data
	 */
	public WorkoutResult(Throwable e) {
		this.state=ERROR;
		this.message=e.getMessage();
	}
	/**
	 * 其他情况
	 * @param state
	 * @param data
	 */
	public WorkoutResult(String state,T data) {
		this.state=state;
		this.data=data;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	@Override
	public String toString() {
		return "WorkoutResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
	
	
	
	
}
