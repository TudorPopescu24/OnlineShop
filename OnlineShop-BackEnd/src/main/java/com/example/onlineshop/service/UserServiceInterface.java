package com.example.onlineshop.service;

import com.example.onlineshop.model.Role;
import com.example.onlineshop.model.User;

import java.util.Optional;

public interface UserServiceInterface {
    public User saveUser(User user);

    public Optional<User> findByUsername(String username);

    public void changeRole(Role role, String username);
}
