package com.security.demo.SpringSecurity.service;

import com.security.demo.SpringSecurity.model.Users;
import com.security.demo.SpringSecurity.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepo usersRepo;

    public Users createUser(Users user){
        return usersRepo.save(user);
    }

    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }
}
