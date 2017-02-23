package com.hibernate.skill.checker.dao.layers;

import com.hibernate.skill.checker.dao.layers.DAOimpl.CourseDAO;
import com.hibernate.skill.checker.dao.layers.DAOimpl.QuestionDAO;
import com.hibernate.skill.checker.dao.layers.DAOimpl.TestDAO;
import com.hibernate.skill.checker.dao.layers.DAOimpl.UserDAO;

/**
 * Created by dreikaa on 2/20/17.
 */
public class Factory {
    private static Factory instance = null;
    private static CourseDAO courseDAO = null;
    private static QuestionDAO questionDAO = null;
    private static TestDAO testDAO = null;
    private static UserDAO userDAO = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static CourseDAO getCourseDAO() {
        if (courseDAO == null) {
            courseDAO = new CourseDAOImpl();
        }
        return courseDAO;
    }

    public static QuestionDAO getQuestionDAO() {
        if (questionDAO == null) {
            questionDAO = new QuestionDAOImpl();
        }
        return questionDAO;
    }

    public static TestDAO getTestDAO() {
        if (testDAO == null) {
            testDAO = new TestDAOImpl();
        }
        return testDAO;
    }

    public static UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

}

