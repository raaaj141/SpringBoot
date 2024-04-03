package com.ecommerce.oraganic.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oraganic.model.User;
import com.ecommerce.oraganic.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/Organic")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/create/data")
    public String postMethodName(@RequestBody User user) {
       String d=userService.getuserName(user);
       return d;
    }
    
    @GetMapping("/Gatdata")
    public List<User> getMethodName(){
        List<User> li=userService.getUserData();
        return li;
    }
    
}