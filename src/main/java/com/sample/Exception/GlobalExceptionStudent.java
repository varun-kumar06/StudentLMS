package com.sample.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionStudent {

	@ExceptionHandler(AgeNotEligible.class)
	public ResponseEntity<String> rr(AgeNotEligible ne){
		return new ResponseEntity<>("Age is more than 18", HttpStatus.BAD_GATEWAY);
	}
}
