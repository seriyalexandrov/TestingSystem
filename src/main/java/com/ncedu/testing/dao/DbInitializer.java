package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Course;
import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.CourseService;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.annotation.PostConstruct;
import java.sql.SQLException;

public class DbInitializer {

    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;

    @PostConstruct
    public void initializeDb() {

        User user = new User();
        user.setName("a");
        user.setPassword("a");
        user.setEmail("a@gmail.com");
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPasswordConfirm(user.getPassword());
        userService.save(user);

        User user1 = new User();
        user1.setName("a1");
        user1.setPassword("a1");
        user1.setEmail("a1@gmail.com");
        user1.setRole("ROLE_USER");
        passwordEncoder = new StandardPasswordEncoder();
        user1.setPassword(passwordEncoder.encode(user1.getPassword()));
        user1.setPasswordConfirm(user1.getPassword());
        userService.save(user1);

        Course course1 = new Course((long) 1, "Java: Syntax", "Some basics of Java Syntax");
        Course course2 = new Course((long) 2, "Java: JDBC", "Data processing over JDBC");
        Course course3 = new Course((long) 3, "Java: Spring Framework", "Check knowledge of ");

        try {
            courseService.save(course1);
            courseService.save(course2);
            courseService.save(course3);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
