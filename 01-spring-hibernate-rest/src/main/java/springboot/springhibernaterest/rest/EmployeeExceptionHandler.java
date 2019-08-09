package springboot.springhibernaterest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<EmployeeError> handleException(IdNotFoundException exc)
	{
		
	 EmployeeError error= new EmployeeError(HttpStatus.NOT_FOUND.value(),
	 
	 exc.getMessage(),System.currentTimeMillis());
	return new ResponseEntity(error,HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler
	public ResponseEntity<EmployeeError> handleException(Exception e)
	{
		
	 EmployeeError error= new EmployeeError(HttpStatus.NOT_FOUND.value(),
	 
	 e.getMessage(),System.currentTimeMillis());
	return new ResponseEntity(error,HttpStatus.NOT_FOUND);
	}

}
