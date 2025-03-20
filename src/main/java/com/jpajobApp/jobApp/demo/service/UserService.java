package com.jpajobApp.jobApp.demo.service;


import com.jpajobApp.jobApp.demo.model.User;
import com.jpajobApp.jobApp.demo.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);


    public User saveUser(User user){
        user.setPass(encoder.encode(user.getPass()));
        return repo.save(user);
    }


}
