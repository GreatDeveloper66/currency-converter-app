package com.adamshaffer.currency_converter_app.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login"; // This should match the name of your HTML template file (login.html)
    }
    // This class will handle the login logic for the application.
    // You can add methods to handle user authentication, validation, etc.
    // For now, it's just a placeholder.
    // You can also add methods to handle user logout, password reset, etc.
    
}
