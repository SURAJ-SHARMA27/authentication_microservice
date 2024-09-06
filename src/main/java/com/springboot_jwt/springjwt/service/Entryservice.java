package com.springboot_jwt.springjwt.service;

import com.springboot_jwt.springjwt.entity.Entry;
import com.springboot_jwt.springjwt.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Entryservice {

    @Autowired
    private EntryRepository entryRepository;

    public void saveEntry(Entry entry){
        entryRepository.save(entry);
    }

    public List<Entry> getAll(){
        return entryRepository.findAll();
    }
}
