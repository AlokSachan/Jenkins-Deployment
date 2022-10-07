package com.alok.controller;

import com.alok.dto.UserDetails;
import com.alok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @GetMapping("/{name}")
    public ResponseEntity<UserDetails> getUserDetails(@PathVariable String name){
        return new ResponseEntity<>(userService.getUserDetails(name), HttpStatus.OK);
    }
}
