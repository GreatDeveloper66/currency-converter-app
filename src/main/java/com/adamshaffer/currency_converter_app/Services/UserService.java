package com.adamshaffer.currency_converter_app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.adamshaffer.currency_converter_app.Model.User.User;
import com.adamshaffer.currency_converter_app.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String email, String password) {
        // Check if the user already exists
        if (userRepository.existsByEmail(email)) {
            throw new RuntimeException("User already exists");
        }
        // Encode the password
        String encodedPassword = passwordEncoder.encode(password);
        // Save the user to the database
        User newUser = new User(email, encodedPassword);
        userRepository.save(newUser);
    }
    private boolean validateUser(String email, String password) {
        // Find the user by username
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false; // User not found
        }
        // Check if the password matches
        return passwordEncoder.matches(password, user.getPassword());
    }
    public void updateUserPassword(String email, String newPassword) {
        // Find the user by username
        User user = userRepository.findByEmail(email);
        // Check if the user exists
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        // Encode the new password
        String encodedPassword = passwordEncoder.encode(newPassword);
        // Update the user's password in the database
        user = new User(user.getEmail(), encodedPassword);
        userRepository.save(user);
    }
    public void deleteUser(String email) {
        // Find the user by username
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        // Delete the user from the database
        userRepository.delete(user);
    }
    public List<User> getAllUsers() {
        // Get all users from the database
        return userRepository.findAll();
    }

    public boolean loginUser(String email, String password) {
        // Find the user by username
        boolean userValid = validateUser(email, password);
        
        if (userValid) {
            // Perform login logic (if any)
            // For now, just return true to indicate successful login
            return true;
        } else {
            return false; // Invalid credentials
        }
     }

     public boolean logoutUser(String email) {
        // Find the user by username
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false; // User not found
        }
        // Perform logout logic (if any)
        // For now, just return true to indicate successful logout
        return true;
    }

    public void updateUser(User user) {
        // Update the user in the database
        userRepository.save(user);
    }
    public void deleteUserById(Long id) {
        // Delete the user by ID
        userRepository.deleteById(id);
    }
}
