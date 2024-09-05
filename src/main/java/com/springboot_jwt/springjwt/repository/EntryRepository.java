package com.springboot_jwt.springjwt.repository;

import com.springboot_jwt.springjwt.entity.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepository extends MongoRepository<Entry,String> {
}
