package uk.co.olimor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

/**
 * Rest controller
 * 
 * @author lcmor
 *
 */
@Controller
@Log4j2
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		log.entry("hello");
		log.error("hello error", "hello error");
		return log.exit("login");
	}

}