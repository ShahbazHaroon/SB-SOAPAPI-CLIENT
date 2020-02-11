package com.ubaidsample.SBSOAPAPICLIENT.client;

import com.ubaidsample.SBSOAPAPICLIENT.soap.bindings.ItemRequest;
import com.ubaidsample.SBSOAPAPICLIENT.soap.bindings.ItemResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Result;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

@Service
public class SoapClient {

	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;

	private WebServiceTemplate webServiceTemplate;

	public ItemResponse getItemInfo(ItemRequest itemRequest){
		webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
		return (ItemResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws",itemRequest);
	}
}