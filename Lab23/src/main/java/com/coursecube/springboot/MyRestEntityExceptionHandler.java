package com.coursecube.springboot;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class MyRestEntityExceptionHandler extends ResponseEntityExceptionHandler {
	

/*
@ExceptionHandler({ CustomerIDNotFoundException.class})
public void handleCidNotFound1(HttpServletResponse response) throws IOException {
response.sendError(999);
}
@ExceptionHandler({ InvalidPhoneNumberException.class})
public void handlePhoneNotFound(HttpServletResponse response) throws IOException {
response.sendError(HttpStatus.BAD_REQUEST.value());
}
@ExceptionHandler({ CityNotFoundException.class})
public void handleCityNotFound(HttpServletResponse response) throws IOException {
response.sendError(HttpStatus.NOT_FOUND.value());
}
*/
	@ExceptionHandler({ CustomerIDNotFoundException.class})
	public ResponseEntity<MyErrorMessage> handleCidNotFound() {
	MyErrorMessage errMsg = new MyErrorMessage();
	errMsg.setTimestamp(LocalDateTime.now());
	errMsg.setError("-----MyCustomer Id is Not Available Guys -------");
	errMsg.setStatus(HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(errMsg, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ InvalidPhoneNumberException.class})
	public ResponseEntity<MyErrorMessage> handlePhoneNotFound(RuntimeException ex,
	WebRequest request) {
	MyErrorMessage errMsg = new MyErrorMessage();
	errMsg.setTimestamp(LocalDateTime.now());
	errMsg.setError(" Phone Number is Not Available");
	errMsg.setStatus(HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(errMsg, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ CityNotFoundException.class})
	public ResponseEntity<MyErrorMessage> handleCityNotFound(RuntimeException ex, WebRequest
	request) {
	MyErrorMessage errMsg = new MyErrorMessage();
	errMsg.setTimestamp(LocalDateTime.now());
	errMsg.setError(" City Not Found in DB");
	errMsg.setStatus(HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(errMsg, HttpStatus.NOT_FOUND);
	}
}