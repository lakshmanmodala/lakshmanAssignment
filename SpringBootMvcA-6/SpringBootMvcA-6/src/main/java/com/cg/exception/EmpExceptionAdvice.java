package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmpExceptionAdvice {

	@ExceptionHandler(value= {EmpIdException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST,reason="Id already exists")
	@ResponseBody
	public void handleException(Exception ex) {
		
	}
	
	@ExceptionHandler(value= {EmpNotFoundException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST,reason="Employee Not Found")
	@ResponseBody
	public void handleException2(Exception ex){
		
	}
	
	public ErrorInfo handleException3(Exception ex) {
		if(ex.getMessage().contains("doj"))
			return new ErrorInfo("Date must have the patten yyyy-M-d");
		return new ErrorInfo(ex.getMessage());
	}
}
