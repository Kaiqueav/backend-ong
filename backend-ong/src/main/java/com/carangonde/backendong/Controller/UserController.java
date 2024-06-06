package com.carangonde.backendong.Controller;

import com.carangonde.backendong.Entity.User;
import com.carangonde.backendong.Service.UserService;
import com.carangonde.backendong.exception.EmailAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
        private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try {
            userService.registerUser(user);
            return ResponseEntity.ok(user); // Retorna o usuário registrado com sucesso
        } catch (EmailAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = userService.getUserId(id);
        return ResponseEntity.ok(user);
    }
    @PutMapping
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        user.setId(id);
        User usuarioAtualizado = userService.updateUser(user);
        return ResponseEntity.ok(usuarioAtualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}


