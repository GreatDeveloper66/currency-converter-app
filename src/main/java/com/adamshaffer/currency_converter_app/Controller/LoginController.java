package com.adamshaffer.currency_converter_app.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login Page");
        model.addAttribute("content", "login :: content");
        model.addAttribute("message", "Please enter your credentials to log in.");
        model.addAttribute("error", false);
        return "login"; // This should match the name of your HTML template file (login.html)
    }
    // This class will handle the login logic for the application.
    // You can add methods to handle user authentication, validation, etc.
    // For now, it's just a placeholder.
    // You can also add methods to handle user logout, password reset, etc.
    
}
