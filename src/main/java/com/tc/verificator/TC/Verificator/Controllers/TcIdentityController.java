package com.tc.verificator.TC.Verificator.Controllers;


import com.tc.verificator.TC.Verificator.Controllers.Requests.TcIdentityVerifyRequest;
import com.tc.verificator.TC.Verificator.Controllers.Responses.Base.ServiceResponse;
import com.tc.verificator.TC.Verificator.Controllers.Responses.TcIdentityVerifyResponse;
import com.tc.verificator.TC.Verificator.Services.TcIdentityService;
import com.tc.verificator.TC.Verificator.Utlis.ResponseResolver;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TcIdentityController {
    private final TcIdentityService tcIdentityService;

    @PostMapping("/verifyTrIdentity/")
    public ResponseEntity<ServiceResponse<TcIdentityVerifyResponse>> verifyTrIdentity(
            @RequestBody @Valid TcIdentityVerifyRequest request) {
        return ResponseResolver.resolve(ServiceResponse.ok(tcIdentityService.verifyIdentity(request)));
    }
}
