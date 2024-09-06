package com.springboot_jwt.springjwt.entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "authUsers")
@Data
public class Entry {



    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

}
