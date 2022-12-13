package demo.testexample.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ExceptionDetails> sourceNotFoundEx(ResourceNotFound ex) {
		ExceptionDetails exceptionDetails = new ExceptionDetails();
		exceptionDetails.setMessage(ex.getMessage());
		exceptionDetails.setDate(new Date());
		return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.NOT_FOUND);

	}

}
