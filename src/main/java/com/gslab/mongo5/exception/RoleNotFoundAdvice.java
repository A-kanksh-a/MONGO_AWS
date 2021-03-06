package com.gslab.mongo5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RoleNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(RoleNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String roleNotFoundHandler(RoleNotFoundException ex) {
		return ex.getMessage();
	}
}
