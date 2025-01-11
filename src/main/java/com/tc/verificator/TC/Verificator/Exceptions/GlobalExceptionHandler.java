package com.tc.verificator.TC.Verificator.Exceptions;

import com.tc.verificator.TC.Verificator.Controllers.Responses.Base.ErrorResponse;
import com.tc.verificator.TC.Verificator.Controllers.Responses.Base.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.tc.verificator.TC.Verificator.Utlis.ResponseResolver.resolve;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ServiceResponse<DomainException>> handleGenericException(Exception ex) {
        return resolve(ServiceResponse.error(ErrorResponse.builder().build(), HttpStatus.BAD_REQUEST));
    }
}

