package com.tc.verificator.TC.Verificator.Configs;

import com.tc.verificator.TC.Verificator.Clients.Mappers.TcIdentityMapper;
import com.tc.verificator.TC.Verificator.Clients.TcIdentityClient;
import com.tc.verificator.TC.Verificator.Clients.TcIdentityClientImpl;
import com.tc.verificator.TC.Verificator.Services.TcIdentityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class BeanConfig {
    @Bean
    TcIdentityService tcIdentityService(TcIdentityMapper tcIdentityMapper, TcIdentityClient tcIdentityClient) {
        return new TcIdentityService(tcIdentityMapper, tcIdentityClient);
    }

    @Bean
    TcIdentityClient tcIdentityClient(WebServiceTemplate webServiceTemplate, Jaxb2Marshaller marshaller) {
        return new TcIdentityClientImpl(webServiceTemplate,marshaller);
    }
}
