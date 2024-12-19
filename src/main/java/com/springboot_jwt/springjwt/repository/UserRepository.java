package com.springboot_jwt.springjwt.repository;

import com.springboot_jwt.springjwt.entity.Entry;
import com.springboot_jwt.springjwt.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
}
