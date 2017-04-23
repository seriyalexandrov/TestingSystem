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

        Course course1 = new Course("Java: Syntax", "Some basics of Java Syntax");
        Course course2 = new Course("Java: JDBC", "Data processing over JDBC");
        Course course3 = new Course("Java: Spring Framework", "Check knowledge of ");
        Test test = new Test("test1","123", course1);
        Question question = new Question("123?", "1-2-3", "2", test);
      
        User user1 = new User();
        user1.setName("a1");
        user1.setPassword("a1");
        user1.setEmail("a1@gmail.com");
        user1.setRole("IS_AUTHENTICATED_FULLY");
        passwordEncoder = new StandardPasswordEncoder();
        user1.setPassword(passwordEncoder.encode(user1.getPassword()));
        user1.setPasswordConfirm(user1.getPassword());
        userService.save(user1);

        try {
            courseService.save(course1);
            courseService.save(course2);
            courseService.save(course3);
            testService.save(test);
            questionService.save(question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            List<Course> list = courseService.findAll();
            System.out.println("----------------------Debug------------------------");
            for (Course c : list) {
                System.out.format("Course #%d: %s\n", c.getId(), c.getName());
                for (Test t : c.getTestList()) {
                    System.out.format("\t Test #%d: %s\n", t.getId(), t.getName());
                    for (Question q : t.getQuestionList()) {
                        System.out.format("\t\t Question #%d: %s\n", q.getId(), q.getText());
                    }
                }
            }
            System.out.println("----------------------Debug------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
