package com.jpajobApp.jobApp.demo.service;


import com.jpajobApp.jobApp.demo.model.User;
import com.jpajobApp.jobApp.demo.model.UserPrinciple;
import com.jpajobApp.jobApp.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailservice implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        User user = repo.findByUsername(username);
        if(user ==null){
            System.out.println("error 404");
            throw new UsernameNotFoundException("Error given");

        }
        return new UserPrinciple(user);
    }
}
