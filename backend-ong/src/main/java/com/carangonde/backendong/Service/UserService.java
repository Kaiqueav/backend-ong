package com.carangonde.backendong.Service;

import com.carangonde.backendong.Entity.User;
import com.carangonde.backendong.Repository.UserRepository;
import com.carangonde.backendong.exception.EmailAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
   private UserRepository userRepository;

 public User registerUser( User user){
        if (userRepository.existsByEmail(user.getEmail())){
            throw new EmailAlreadyExistsException("Email ja exitse");
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
    public void deleteUser(Long id){userRepository.deleteById(id);
    }

}
