package com.alok.service;

import com.alok.dto.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserDetails getUserDetails(String name) {
        UserDetails userService = new UserDetails();
        userService.setName(name);
        return userService;
    }
}
