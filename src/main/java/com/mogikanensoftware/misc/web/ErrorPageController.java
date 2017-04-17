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
}
