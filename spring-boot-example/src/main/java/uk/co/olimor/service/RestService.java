package uk.co.olimor.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getAccountSummary() {
		return "This should still be working.";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/status")
	public String getHealth() {
		return "Yup, I'm up and running.";
	}

}
