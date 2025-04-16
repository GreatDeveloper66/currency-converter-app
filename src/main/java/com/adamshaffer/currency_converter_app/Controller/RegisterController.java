package com.adamshaffer.currency_converter_app.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Register Page");
        model.addAttribute("content", "register :: content");
        model.addAttribute("message", "Please enter your credentials to register.");
        model.addAttribute("error", false);

        return "register"; // This should match the name of your HTML template file (register.html)
    }
    // This class will handle the registration logic for the application.
    // You can add methods to handle user registration, validation, etc.
    // For now, it's just a placeholder.
}
