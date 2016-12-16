package com.ferlodevs.service;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/payment")


public class PaymentServiceController {
	// Logger instance
	private static final Logger logger = Logger.getLogger(SimpleRestController.class);
}
