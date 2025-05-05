package com.adamshaffer.currency_converter_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adamshaffer.currency_converter_app.Model.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email); // Method to find a user by their email address
    boolean existsByEmail(String email); // Method to check if an email already exists
}
