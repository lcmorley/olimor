package uk.co.olimor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAccountsOverviewController {

	@RequestMapping("/overview")
	public String overview(Model model) {
		model.addAttribute("username", "leonmorley");
		
		return "overview";
	}
}
