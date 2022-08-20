package com.example.core.controller;

import java.util.List;

import com.example.core.entity.UserEntity;
import com.example.core.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @Autowired
    private IUserRepository _userRepository;

    @GetMapping("/connect-db")
    public List<?> helloWord() {
        List<UserEntity> entities = _userRepository.findAll();
        entities.get(0).getUserName();
        return _userRepository.findAll();
    }
}
