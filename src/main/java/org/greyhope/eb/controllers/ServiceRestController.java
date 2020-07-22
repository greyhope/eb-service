package org.greyhope.eb.controllers;

import org.greyhope.eb.documents.ServiceInput;
import org.greyhope.eb.documents.ServiceOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRestController.class.getName());
	
	public ServiceRestController () {
		super();
	}
	
	@RequestMapping(method= {RequestMethod.POST}, path = "/performService")
	public ServiceOutput performService(@RequestBody ServiceInput input) {
		
		LOGGER.info("Starting service invocation...");
		
		ServiceOutput response = new ServiceOutput();
		response.setPayload(input.getPayload());
		response.setRequestId(input.getRequestId());
		
		LOGGER.debug("Completing service invocation...");
		return response;
	}
	
	
}
