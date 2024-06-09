package com.normcontback.normcontback.services;

import java.util.List;
import java.util.Optional;

import com.normcontback.normcontback.entities.User;

public interface UserService {


    List<User> findAll();

    Optional<User> findById(Integer IIdUserd);

    User save(User user);

    void deleteById(Integer IdUser);

    
    

}
