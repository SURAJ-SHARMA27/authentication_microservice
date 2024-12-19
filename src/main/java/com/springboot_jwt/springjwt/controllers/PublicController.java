package com.springboot_jwt.springjwt.controllers;


import com.springboot_jwt.springjwt.entity.User;
import com.springboot_jwt.springjwt.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private Userservice userservice;


    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userservice.saveEntry(user);
    }

}
