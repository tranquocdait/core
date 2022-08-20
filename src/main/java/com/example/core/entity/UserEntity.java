package com.example.core.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document("user")
@Data
public class UserEntity {

    @Id
    private ObjectId id;

    @Field("user_name")
    private String userName;
}
