package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllOrders(User user) {
        return userService.getAllUsers(user).stream()
                .sorted(Comparator.comparingLong(user1 -> user1.getUserId()))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void createOrder(@RequestBody User user) {
        userService.insertUser(user);
    }
}
