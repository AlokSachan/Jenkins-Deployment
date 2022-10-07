package com.alok.controller;

import com.alok.adapter.UserAdapter;
import com.alok.dto.UserDetails;
import com.alok.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserAdapter userAdapter;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable Long id){
        log.info("received request to get user details for {}", id);
        return new ResponseEntity<>(userAdapter.adapt(userService.getUserDetailsById(id)), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
             consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> registerUser(@RequestBody UserDetails userDetails){
        log.info("received request to register new user");
        return new ResponseEntity<>(userAdapter.adapt(userService.registerUser(userAdapter.adapt(userDetails))), HttpStatus.CREATED);
    }
}
