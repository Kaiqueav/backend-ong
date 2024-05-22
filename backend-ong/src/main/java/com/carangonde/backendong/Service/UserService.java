package com.carangonde.backendong.Service;

import com.carangonde.backendong.Model.User;
import com.carangonde.backendong.Repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserService {
    @Autowired
   private UserRepository userRepository;
    @Autowired
    private ValidatorFactory validatorFactor;
    public User saveUser( User user){
        //valid
        Validator validator = validatorFactor.getValidator();
        Set<ConstraintValidator<User>> violations = validator.validate(User);

    }

}
