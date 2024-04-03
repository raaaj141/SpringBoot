package com.ecommerce.oraganic.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.oraganic.model.User;
import com.ecommerce.oraganic.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    @SuppressWarnings("null")
    public String getuserName(User user) {
        userRepo.save(user);
        return user.getUser_name();
    }

    public List<User> getUserData() {
       List<User> li=new ArrayList<>(userRepo.findAll());
       return li;
    }

  

   
    
}