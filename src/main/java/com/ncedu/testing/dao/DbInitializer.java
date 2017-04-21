package com.ncedu.testing.dao;

import com.ncedu.testing.entity.*;
import com.ncedu.testing.service.*;
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
    @Autowired
    private QuestionService questionService;
    @Autowired
    private TestService testService;
    @Autowired
    private ResultService resultService;

    @PostConstruct
    public void initializeDb() {

        User user = new User();
        user.setName("a");
        user.setPassword("a");
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);

        Course course1 = new Course("Java: Syntax", "Some basics of Java Syntax");
        Course course2 = new Course("Java: JDBC", "Data processing over JDBC");
        Course course3 = new Course("Java: Spring Framework", "Check knowledge of ");
        Test test = new Test("test1","123",course1);
        Question question = new Question("123?","1-2-3","2",test);

        try {
            courseService.save(course1);
            courseService.save(course2);
            courseService.save(course3);
            testService.save(test);
            questionService.save(question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
