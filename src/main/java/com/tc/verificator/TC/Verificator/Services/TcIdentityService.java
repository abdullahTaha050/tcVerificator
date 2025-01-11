package com.tc.verificator.TC.Verificator.Services;

import com.tc.verificator.TC.Verificator.Clients.Mappers.TcIdentityMapper;
import com.tc.verificator.TC.Verificator.Clients.TcIdentityClient;
import com.tc.verificator.TC.Verificator.Controllers.Requests.TcIdentityVerifyRequest;
import com.tc.verificator.TC.Verificator.Controllers.Responses.TcIdentityVerifyResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TcIdentityService {
    private final TcIdentityMapper tcIdentityMapper;
    private final TcIdentityClient tcIdentityClient;

    public TcIdentityVerifyResponse verifyIdentity(TcIdentityVerifyRequest verifyRequest) {
        return tcIdentityMapper.toVerifyTcIdentityResponse(tcIdentityClient.verifyTrIdentity(tcIdentityMapper.toVerifyIdentityRequestDTO(verifyRequest)));
    }
}
