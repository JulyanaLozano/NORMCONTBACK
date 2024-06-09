package com.normcontback.normcontback.repositories;


import org.springframework.data.repository.CrudRepository;

import com.normcontback.normcontback.entities.User;


public interface UserRepository extends CrudRepository<User,Integer>{

}
