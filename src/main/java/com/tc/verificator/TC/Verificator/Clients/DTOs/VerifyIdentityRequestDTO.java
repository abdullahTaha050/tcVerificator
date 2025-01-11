package com.tc.verificator.TC.Verificator.Clients.DTOs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "TCKimlikNoDogrula", namespace = "http://tckimlik.nvi.gov.tr/WS")
@XmlAccessorType(XmlAccessType.FIELD)
public class VerifyIdentityRequestDTO {

    @XmlElement(name = "TCKimlikNo", namespace = "http://tckimlik.nvi.gov.tr/WS")
    private String tcIdentityNo;

    @XmlElement(name = "Ad", namespace = "http://tckimlik.nvi.gov.tr/WS")
    private String firstName;

    @XmlElement(name = "Soyad", namespace = "http://tckimlik.nvi.gov.tr/WS")
    private String lastName;

    @XmlElement(name = "DogumYili", namespace = "http://tckimlik.nvi.gov.tr/WS")
    private int birthYear;
}
