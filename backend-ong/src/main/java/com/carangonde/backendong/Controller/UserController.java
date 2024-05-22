package com.carangonde.backendong.Controller;

import com.carangonde.backendong.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@RequestBody User user){
        User  userSave = userService;
    }
}
