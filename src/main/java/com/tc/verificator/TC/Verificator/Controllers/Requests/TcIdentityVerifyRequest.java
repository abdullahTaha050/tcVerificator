package com.tc.verificator.TC.Verificator.Controllers.Requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TcIdentityVerifyRequest {
    @Size(min = 11, max = 11)
    private String tcIdentityNo;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer birthYear;
}
