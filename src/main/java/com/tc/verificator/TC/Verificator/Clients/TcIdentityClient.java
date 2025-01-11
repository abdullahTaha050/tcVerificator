package com.tc.verificator.TC.Verificator.Clients;

import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityRequestDTO;
import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityResponseDTO;

public interface TcIdentityClient {
    VerifyIdentityResponseDTO verifyTrIdentity(VerifyIdentityRequestDTO verifyIdentityRequest);
}
