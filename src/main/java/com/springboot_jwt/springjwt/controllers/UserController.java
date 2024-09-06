package com.springboot_jwt.springjwt.controllers;


import com.springboot_jwt.springjwt.entity.Entry;
import com.springboot_jwt.springjwt.entity.User;
import com.springboot_jwt.springjwt.service.Entryservice;
import com.springboot_jwt.springjwt.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

 @Autowired
 private Userservice userservice;

 @GetMapping
    public List<User> getAllUsers(){
     return userservice.getAll();
 }

 @PostMapping
    public void createUser(@RequestBody User user){
     userservice.saveEntry(user);
 }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user) {

        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String userName=authentication.getName();
        User userInDb = userservice.findByUserName(userName);
        userInDb.setUserName(user.getUserName());
        userInDb.setPassword(user.getPassword());
        userservice.saveEntry(userInDb);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
