package com.ncedu.testing.dao;

import com.ncedu.testing.entity.*;
import com.ncedu.testing.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.List;

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
        user.setEmail("a@gmail.com");
        PasswordEncoder passwordEncoder = new StandardPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPasswordConfirm(user.getPassword());
        userService.save(user);

        Course java_course = new Course("JAVA language", "Learn the basics of JAVA programming language.");
            Test java_test1 = new Test("Java: Syntax", "Some basics of Java Syntax", java_course);
                Question q1 = new Question("123?", "1-2-3", "2", java_test1);
            Test java_test2 = new Test("Java: JDBC", "Data processing over JDBC", java_course);
                Question q2 = new Question("123?", "1-2-3", "2", java_test2);
            Test java_test3 = new Test("Java: Spring Framework", "Check knowledge of Spring Framework", java_course);
                Question q3 = new Question("123?", "1-2-3", "2", java_test3);


        Course php_course = new Course("PHP language", "Learn the basics of PHP programming language.");
            Test php_test1 = new Test("PHP: Syntax", "Some basics of PHP Syntax", php_course);
                Question php_q1 = new Question("123?", "1-2-3", "2", php_test1);
            Test php_test2 = new Test("PHP: Connecting to DB", "Data processing and storing using PHP", php_course);
                Question php_q2 = new Question("123?", "1-2-3", "2", php_test2);


        User user1 = new User();
        user1.setName("a1");
        user1.setPassword("a1");
        user1.setEmail("a1@gmail.com");
        user1.setRole("ROLE_STUDENT");
        passwordEncoder = new StandardPasswordEncoder();
        user1.setPassword(passwordEncoder.encode(user1.getPassword()));
        user1.setPasswordConfirm(user1.getPassword());
        userService.save(user1);

        try {
            courseService.save(java_course);
            courseService.save(php_course);
            testService.save(java_test1);
            testService.save(java_test2);
            testService.save(java_test3);
            testService.save(php_test1);
            testService.save(php_test2);
            questionService.save(q1);
            questionService.save(q2);
            questionService.save(q3);
            questionService.save(php_q1);
            questionService.save(php_q2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
