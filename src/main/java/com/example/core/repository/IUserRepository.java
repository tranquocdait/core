package com.example.core.repository;

import com.example.core.entity.UserEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<UserEntity, String> {
    
}
