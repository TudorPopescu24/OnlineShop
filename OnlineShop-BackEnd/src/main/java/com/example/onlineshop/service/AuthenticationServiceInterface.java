package com.example.onlineshop.service;

import com.example.onlineshop.model.User;

public interface AuthenticationServiceInterface {
    User signInAndReturnJWT(User signInRequest);
}
