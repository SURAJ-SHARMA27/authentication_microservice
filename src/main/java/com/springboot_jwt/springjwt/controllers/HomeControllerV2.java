package com.springboot_jwt.springjwt.controllers;


import com.springboot_jwt.springjwt.entity.Entry;
import com.springboot_jwt.springjwt.service.Entryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entries")
public class HomeControllerV2 {

    @Autowired
    private Entryservice entryservice;

    @GetMapping
    public List<Entry> getAll(){
//        return new ArrayList<>(Entries.values());
        return  entryservice.getAll();
    }

    @PostMapping
    public Entry createEntry(@RequestBody Entry myEntry){
//        myEntry.setDate(LocalDateTime.now());
        entryservice.saveEntry(myEntry);
        return myEntry;
    }
}
