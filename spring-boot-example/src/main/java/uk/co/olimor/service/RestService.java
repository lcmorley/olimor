package uk.co.olimor.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="OlimorController")
public class RestService {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Blah Boot!";
	}

}
