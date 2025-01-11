package com.tc.verificator.TC.Verificator.Utlis;

import com.tc.verificator.TC.Verificator.Controllers.Responses.Base.ServiceResponse;
import org.springframework.http.ResponseEntity;

public class ResponseResolver {

    public static <T> ResponseEntity<ServiceResponse<T>> resolve(ServiceResponse<T> serviceResponse) {
        return new ResponseEntity<>(serviceResponse, serviceResponse.getStatus());
    }
}
