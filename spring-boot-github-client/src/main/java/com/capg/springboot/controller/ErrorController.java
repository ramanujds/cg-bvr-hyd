package com.capg.springboot.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND,reason = "User Not Found", value = HttpStatus.NOT_FOUND)
	public void handleError() {
		
	}
	
	@ExceptionHandler({ArithmeticException.class,IOException.class})
	public void handleArithmaticAndIoErrors() {
		
	}
}
