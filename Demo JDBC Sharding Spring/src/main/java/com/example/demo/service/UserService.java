package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(User user) {
        return userMapper.selectAllUsers(user);
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
