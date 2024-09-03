package com.springboot_jwt.springjwt.services;

import com.springboot_jwt.springjwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store= new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Suraj Sharma","suraj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit Sharma","ankit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rishi Shukla","rishi@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
