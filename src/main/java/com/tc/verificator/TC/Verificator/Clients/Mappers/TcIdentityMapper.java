package com.tc.verificator.TC.Verificator.Clients.Mappers;

import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityRequestDTO;
import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityResponseDTO;
import com.tc.verificator.TC.Verificator.Controllers.Requests.TcIdentityVerifyRequest;
import com.tc.verificator.TC.Verificator.Controllers.Responses.TcIdentityVerifyResponse;
import org.mapstruct.Mapper;

@Mapper
public interface TcIdentityMapper {
    VerifyIdentityRequestDTO toVerifyIdentityRequestDTO(TcIdentityVerifyRequest tcIdentityVerifyRequest);
    TcIdentityVerifyResponse toVerifyTcIdentityResponse(VerifyIdentityResponseDTO verifyIdentityResponseDTO);
}
