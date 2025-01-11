package com.tc.verificator.TC.Verificator.Controllers.Responses.Base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse<T> {

    private T code;
}
