package com.capg.demo.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.capg.demo.exceptions.ExceptionResponse;
import com.capg.demo.exceptions.UserNotFoundException;

@RestController
@ControllerAdvice
public class UserErrorRestController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND, value = HttpStatus.NOT_FOUND,reason = "User Not Found")
	@ExceptionHandler(UserNotFoundException.class)
	public ExceptionResponse handleUserNotFoundException(WebRequest request) {
		return new ExceptionResponse(LocalDate.now(),HttpStatus.NOT_FOUND,"Not Found",request.getDescription(true),request.getContextPath());
	}
}
