package com.tc.verificator.TC.Verificator.Controllers.Responses.Base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString
@AllArgsConstructor(staticName = "of")
public class ServiceResponse<T> {

    private T data;
    private ErrorResponse error;

    private HttpStatus status;

    public static <T> ServiceResponse<T> ok(T data) {
        return of(data, null, HttpStatus.OK);
    }
    public static <T> ServiceResponse<T> ok() {
        return of(null, null, HttpStatus.OK);
    }
    public static <T> ServiceResponse<T> error(ErrorResponse error, HttpStatus httpStatus) {
        return of(null, error, httpStatus);
    }
}
