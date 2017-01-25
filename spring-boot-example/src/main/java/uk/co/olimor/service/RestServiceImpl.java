package uk.co.olimor.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

/**
 * Controller for the Rest Service.
 * 
 * @author lcmor
 *
 */
@RestController
@Log4j2
public class RestServiceImpl {

	/**
	 * @return account summary as JSON String.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/summary")
	public String getAccountSummary(final String userId) {
		log.entry(userId);
		return log.traceExit("Summary JSON String Changed again.");
	}

	/**
	 * @return the status of this service.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/status")
	public String getStatus() {
		log.traceEntry();
		return log.traceExit("I am running.");
	}

}
