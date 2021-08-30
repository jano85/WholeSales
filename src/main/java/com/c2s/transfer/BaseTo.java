package com.c2s.transfer;

import java.util.List;

public class BaseTo {
private String message;
private int code;
private List<Object> data;

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public List<Object> getData() {
	return data;
}
public void setData(List<Object> data) {
	this.data = data;
}

	@Override
	public String toString() {
		return "BaseTo{" +
				"message='" + message + '\'' +
				", code=" + code +
				", data=" + data +
				'}';
	}
}
