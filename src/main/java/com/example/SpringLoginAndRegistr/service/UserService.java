package com.example.SpringLoginAndRegistr.service;

import com.example.SpringLoginAndRegistr.model.User;
import com.example.SpringLoginAndRegistr.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
