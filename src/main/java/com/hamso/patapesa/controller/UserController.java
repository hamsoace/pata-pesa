package com.hamso.patapesa.controller;

import com.hamso.patapesa.models.User;
import com.hamso.patapesa.service.UserService;
import com.hamso.patapesa.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    private UserService userService;
    private UserServiceImpl userServiceImpl;

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/{id}")
    public List<User> getUser() {
        return userService.getUser();
    }

    @GetMapping("/{id}/amount")
    public void getAmount() {
        userService.getAmount();
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
