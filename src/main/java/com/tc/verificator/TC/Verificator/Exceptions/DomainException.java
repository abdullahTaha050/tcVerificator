package com.tc.verificator.TC.Verificator.Exceptions;

import com.tc.verificator.TC.Verificator.Enums.ExceptionCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class DomainException extends RuntimeException {

    private final ExceptionCode code;
}
