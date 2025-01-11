package com.tc.verificator.TC.Verificator.Clients.DTOs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "TCKimlikNoDogrulaResponse", namespace = "http://tckimlik.nvi.gov.tr/WS")
@XmlAccessorType(XmlAccessType.FIELD)
public class VerifyIdentityResponseDTO {
    @XmlElement(name = "TCKimlikNoDogrulaResult", namespace = "http://tckimlik.nvi.gov.tr/WS")
    private Boolean result;
}
