package com.ferlodevs.service;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/payment")


public class PaymentServiceController {
	// Logger instance
	private static final Logger logger = Logger.getLogger(SimpleRestController.class);
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getSomething(@RequestParam(value = "idPayment", required = false, defaultValue = "1") int idPayment) {
		
		if (logger.isDebugEnabled()) {
			logger.debug("Start getSomething");
			logger.debug("data: '" + idPayment + "'");
		}

		String response = null;

		try {
			switch (idPayment) {
			case 0:
				if (logger.isDebugEnabled())
					logger.debug("in effective payment");
				// TODO: add your business logic here
				response = "Effective Payment : ";

				break;
				case 1:
					if (logger.isDebugEnabled())
						logger.debug("in credit card payment");
					// TODO: add your business logic here
					response = "Credit card Payment : ";
			default:
				throw new Exception("Unsupported version: " + idPayment);
			}
		} catch (Exception e) {
			response = e.getMessage().toString();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}
}
