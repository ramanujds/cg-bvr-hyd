package com.capg.demo.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {

	private LocalDate timeStamp;
	private HttpStatus status;
	private String message;
	private String description;
	private String path;
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public ExceptionResponse(LocalDate timeStamp, HttpStatus status, String message, String description, String path) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.message = message;
		this.description = description;
		this.path = path;
	}
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}
	
}
