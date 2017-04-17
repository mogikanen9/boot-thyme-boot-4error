package com.mogikanensoftware.misc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageController {

	@Value("${errormsg.auth}")
	private String authErrorMessage;
	
	@Value("${errormsg.generic}")
	private String genericErrorMessage;

	@RequestMapping("/index")
	public String greeting(Model model) {
		model.addAttribute("myMessage", "Hello from controller!");
		return "index";
	}

	@RequestMapping("/genericError")
	public String genericError(Model model) {
		model.addAttribute("myMessage", genericErrorMessage);
		return "error";
	}

	@RequestMapping("/authError")
	public String authError(Model model) {
		model.addAttribute("myMessage",
				authErrorMessage);
		return "error";
	}
}
