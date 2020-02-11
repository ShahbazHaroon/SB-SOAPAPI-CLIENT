package com.ubaidsample.SBSOAPAPICLIENT.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

	private static final Logger logger = Logger.getLogger(SoapConfig.class);
	
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan("com.ubaidsample.SBSOAPAPICLIENT.soap.bindings");
        return jaxb2Marshaller;
    }
}