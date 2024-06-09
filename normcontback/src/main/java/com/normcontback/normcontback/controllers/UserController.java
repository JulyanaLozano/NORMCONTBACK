package com.normcontback.normcontback.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.normcontback.normcontback.entities.User;
import com.normcontback.normcontback.services.UserService;



@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getListUser(){
        return userService.findAll();

    }
    @SuppressWarnings("rawtypes")
    @GetMapping("/{IdUser}")
    public ResponseEntity getId(@PathVariable Integer IdUser){
        Optional<User> userOptional = userService.findById(IdUser);
        if(userOptional.isPresent()){
            return  ResponseEntity.ok(userOptional.orElseThrow());
        }else{
            return ResponseEntity.status(404).body(Collections.singletonMap("error","Usuario no existe"+IdUser));
        }
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        
        return ResponseEntity.status(201).body(userService.save(user));
    }

    @SuppressWarnings("rawtypes")
    @PutMapping("/{IdUser}")
    public ResponseEntity updateUser(@PathVariable Integer IdUser, @RequestBody User user) {
        Optional<User> userOptional = userService.findById(IdUser);
        if (userOptional.isPresent()) {
            User userExist = userOptional.get();
            userExist.setCodUsuario(user.getCodUsuario());
            userExist.setEmail(user.getEmail());
            userExist.setEstadoUsuario(user.getEstadoUsuario());
            userExist.setNombreUsuario(user.getNombreUsuario());
            userExist.setApellidoUsuario(user.getApellidoUsuario());
            userExist.setIdentificacion(user.getIdentificacion());
            userExist.setTipoIdentificacion(user.getTipoIdentificacion());
            userExist.setPassword(user.getPassword());
            return ResponseEntity.ok(userService.save(userExist));
            
        }else{
            return ResponseEntity.status(404).body(Collections.singletonMap("error","Usuario no existe"+IdUser));

        }
    }

    @DeleteMapping("/{IdUser}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer IdUser){
        Optional<User> userOptional = userService.findById(IdUser);
        if (userOptional.isPresent()) {
            userService.deleteById(IdUser);
            return ResponseEntity.noContent().build();

        }else{
            return ResponseEntity.status(404).body(Collections.singletonMap("error","Usuario no existe"+IdUser));
        }

    }
    
    

}
