package com.capg.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "User Not Found", value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
public UserNotFoundException(String message) {
	// TODO Auto-generated constructor stub
	super(message);
}
}
