package com.carangonde.backendong.Controller;

import com.carangonde.backendong.Model.User;
import com.carangonde.backendong.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
        private UserService userService;
    @PostMapping
    ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.registerUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = userService.getUserId(id);
        return ResponseEntity.ok(user);
    }


