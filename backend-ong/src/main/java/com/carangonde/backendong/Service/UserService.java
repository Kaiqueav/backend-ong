package com.carangonde.backendong.Service;

import com.carangonde.backendong.Model.User;
import com.carangonde.backendong.Repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserService {
    @Autowired
   private UserRepository userRepository;
    @Autowired
 public User registerUser( User user){
        if (userRepository.findByEmail(user.getEmail()) != null){
            throw new RuntimeException("Email ja exitse");
        }
        return userRepository.save(user);
    }
    public User updateUser (User user){
        return userRepository.save(user);
    }
    public User getUserId (Long id){
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Usuario sem encotar"));
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
