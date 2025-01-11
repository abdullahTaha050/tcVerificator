package com.tc.verificator.TC.Verificator.Clients.DTOs;


import jakarta.xml.bind.annotation.XmlRegistry;
import lombok.NoArgsConstructor;

@XmlRegistry
@NoArgsConstructor
public class ObjectFactory {

    public VerifyIdentityRequestDTO createVerifyIdentityRequestDTO() {
        return new VerifyIdentityRequestDTO();
    }

    public VerifyIdentityResponseDTO createVerifyIdentityResponseDTO() {
        return new VerifyIdentityResponseDTO();
    }
}

