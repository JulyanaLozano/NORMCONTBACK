package com.normcontback.normcontback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.normcontback.normcontback.entities.User;
import com.normcontback.normcontback.repositories.UserRepository;



@Service
public class UserServiceImpl implements UserService{


    private final UserRepository userepository;

    public UserServiceImpl(UserRepository userepository) {
        this.userepository = userepository;
    }




    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    @Transactional
        public List<User> findAll() {
            return  (List) this.userepository.findAll();
        }



    @Override
    @Transactional
    public Optional<User> findById(Integer IdUser) {
        return this.userepository.findById(IdUser);
    }



    @Override
    @Transactional
    public User save(User user) {
        return this.userepository.save(user);
    }



    @Override
    @Transactional
    public void deleteById(Integer IdUser) {
        userepository.deleteById(IdUser);
    }
}
