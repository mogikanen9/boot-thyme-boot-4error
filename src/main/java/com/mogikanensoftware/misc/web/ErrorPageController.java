package com.mogikanensoftware.misc.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageController {

	@RequestMapping("/index")
    public String greeting(Model model) {
        model.addAttribute("myMessage", "Hello from controller!");
        return "index";
    }
	
	@RequestMapping("/genericError")
    public String genericError(Model model) {
        model.addAttribute("myMessage", "Ups! Somthing went wrong.");
        return "genericError";
    }
	@RequestMapping("/authError")
    public String authError(Model model) {
        model.addAttribute("myMessage", "Auth Error! Unfortunately you are not authorized to access the requested application.");
        return "authorizationError";
    }
}
