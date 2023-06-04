package com.medicine.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiErrors {

	LocalDateTime timeStamp;
	String message;
	HttpStatus status;
	int statusCode;
	List<Object> error;
	public ApiErrors(LocalDateTime timeStamp, String message, HttpStatus status, int statusCode, List<Object> error) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
		this.error = error;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public List<Object> getError() {
		return error;
	}
	public void setError(List<Object> error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "ApiErrors [timeStamp=" + timeStamp + ", message=" + message + ", status=" + status + ", statusCode="
				+ statusCode + ", error=" + error + "]";
	}
	
	
}
