package com.covid.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(LoginException.class)
	public ResponseEntity<ErrorDetails> employeeExceptionHandler(LoginException ee, WebRequest req) {
		ErrorDetails err = new ErrorDetails();
		err.setLocalDateTime(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(SingUpException.class)
	public ResponseEntity<ErrorDetails> SignUpExceptionHandler(SingUpException ee, WebRequest req) {
		ErrorDetails err = new ErrorDetails();
		err.setLocalDateTime(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExceptionHandler(Exception er, WebRequest req) {

		ErrorDetails err = new ErrorDetails(LocalDateTime.now(), er.getMessage(), req.getDescription(false));

		return new ResponseEntity<ErrorDetails>(err,HttpStatus.NOT_ACCEPTABLE);

	}
}
