package com.project.WebService.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.WebService.services.exceptions.DatabaseException;
import com.project.WebService.services.exceptions.ResourceNotFoundException;

//interceptar as exceções para que o objeto realize o tratamento
@ControllerAdvice
public class ResourceExceptionHandler {
	
	//interceptar
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
			String error = "Resource Not Found";
			HttpStatus status = HttpStatus.NOT_FOUND;
			StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
			return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request){
			String error = "Database Error";
			HttpStatus status = HttpStatus.BAD_REQUEST;
			StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
			return ResponseEntity.status(status).body(err);
	}
	
}
