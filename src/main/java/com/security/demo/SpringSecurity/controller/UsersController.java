package com.security.demo.SpringSecurity.controller;

import com.security.demo.SpringSecurity.model.Users;
import com.security.demo.SpringSecurity.service.JwtService;
import com.security.demo.SpringSecurity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private JwtService jwtService;

    @GetMapping("/")
    public List<Users> getUsersService() {
        return usersService.getAllUsers();
    }

    @PostMapping("/register")
    public Users createUser(@RequestBody Users user) {
        return usersService.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return usersService.verify(user);
    }

    @DeleteMapping("/")
    public String deleteUsers(@RequestParam String username){
        return usersService.deleteByUsername(username);
    }

}
