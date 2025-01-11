package com.tc.verificator.TC.Verificator.Clients;


import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityRequestDTO;
import com.tc.verificator.TC.Verificator.Clients.DTOs.VerifyIdentityResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

@RequiredArgsConstructor
public class TcIdentityClientImpl implements TcIdentityClient {
    private final WebServiceTemplate webServiceTemplate;
    private final Jaxb2Marshaller marshaller;

    @Value("${nvi.service.url}")
    private String nviServiceUrl;

    @Override
    public VerifyIdentityResponseDTO verifyTrIdentity(VerifyIdentityRequestDTO verifyIdentityRequest) {
        prepareMarshallerandWebServiceTemplate();

        return (VerifyIdentityResponseDTO) webServiceTemplate.marshalSendAndReceive(
                verifyIdentityRequest,
                message -> {
                    SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                    addMimeHeaders(soapMessage);
                }
        );
    }

    private void addMimeHeaders(SaajSoapMessage soapMessage) {
        soapMessage.getSaajMessage().getMimeHeaders().addHeader("POST", "/Service/KPSPublic.asmx HTTP/1.1");
        soapMessage.getSaajMessage().getMimeHeaders().addHeader("Host", "tckimlik.nvi.gov.tr");
        soapMessage.getSaajMessage().getMimeHeaders().addHeader("Accept", "*/*");
        soapMessage.getSaajMessage().getMimeHeaders().addHeader("Content-Type", "text/xml; charset=utf-8");
        soapMessage.getSaajMessage().getMimeHeaders().removeHeader("SOAPAction");
        soapMessage.getSaajMessage().getMimeHeaders().addHeader("SOAPAction", "\"http://tckimlik.nvi.gov.tr/WS/TCKimlikNoDogrula\"");
    }


    private void prepareMarshallerandWebServiceTemplate() {
        try {
            webServiceTemplate.setDefaultUri(nviServiceUrl);
            webServiceTemplate.setMarshaller(marshaller);
            webServiceTemplate.setUnmarshaller(marshaller);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
