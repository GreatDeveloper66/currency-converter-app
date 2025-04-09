package com.adamshaffer.currency_converter_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "chatGpt");
        return "greeting"; // This should match the name of your HTML template file (greeting.html)
    }
}