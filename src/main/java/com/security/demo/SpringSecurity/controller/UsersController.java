package com.security.demo.SpringSecurity.controller;

import com.security.demo.SpringSecurity.model.Users;
import com.security.demo.SpringSecurity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public List<Users> getUsersService() {
        return usersService.getAllUsers();
    }

    @PostMapping("/")
    public Users createUser(@RequestBody Users user) {
        return usersService.createUser(user);
    }

}
