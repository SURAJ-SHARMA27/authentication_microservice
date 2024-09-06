package com.springboot_jwt.springjwt.service;

import com.springboot_jwt.springjwt.entity.Entry;
import com.springboot_jwt.springjwt.entity.User;
import com.springboot_jwt.springjwt.repository.EntryRepository;
import com.springboot_jwt.springjwt.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Userservice {

    @Autowired
    private UserRepository userRepository;
    private static final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    public void saveEntry(User entry)
    {
        entry.setPassword(passwordEncoder.encode(entry.getPassword()));
        entry.setRoles(Arrays.asList("USER"));
        userRepository.save(entry);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
