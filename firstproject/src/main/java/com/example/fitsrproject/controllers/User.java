package com.example.fitsrproject.controllers;

import com.example.fitsrproject.domain.UserModel;
import com.example.fitsrproject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserModel> allUsers(){
       return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody() UserModel userModel){
       return userServices.saveUser(userModel);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody() UserModel userModel){
        return userServices.updateUser(userModel);
    }

    @GetMapping("/find/{id}")
    public UserModel getUserById(@PathVariable Integer id){
       return userServices.findById(id);
    }
}
