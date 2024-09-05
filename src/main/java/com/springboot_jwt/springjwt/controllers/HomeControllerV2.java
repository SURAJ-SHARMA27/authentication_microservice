package com.springboot_jwt.springjwt.controllers;


import com.springboot_jwt.springjwt.entity.Entry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_entries")
public class HomeControllerV2 {

    private Map<Long, Entry> Entries=new HashMap<>();

    @GetMapping
    public List<Entry> getAll(){
//        return new ArrayList<>(Entries.values());
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody Entry myEntry){
//        Entries.put(myEntry.getId(),myEntry);
        return true;
    }
}
