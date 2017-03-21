package com.ncedu.testing.dao;

import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.annotation.PostConstruct;

public class DbInitializer {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initializeDb() {

        User user = new User();
        user.setName("a");
        user.setPassword("a");
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
    }
}
