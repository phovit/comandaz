package br.com.opasystems.comanda.handler;

import br.com.opasystems.comanda.dto.ErrorResponse;
import br.com.opasystems.comanda.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> handleUnexpectedException(ValidationException e) {

        // below object should be serialized to json
        ErrorResponse errorResponse = new ErrorResponse(e.getError(), e.getMessage());

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
