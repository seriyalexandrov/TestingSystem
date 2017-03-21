package com.ncedu.testing.dao.impl;

import com.ncedu.testing.dao.CourseDAO;
import com.ncedu.testing.entity.Course;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collection;

@Transactional
@Repository
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addCourse(Course course) throws SQLException {
        sessionFactory.getCurrentSession().save(course);
    }

    public void updateCourse(Course course) throws SQLException {
        sessionFactory.getCurrentSession().update(course);
    }

    public Course getCourseById(Long id) throws SQLException {
        return (Course) sessionFactory.getCurrentSession().load(Course.class, id);
    }

    public Collection<Course> getAllCourses() throws SQLException {
        return sessionFactory.getCurrentSession().createCriteria(Course.class).list();
    }

    public void deleteCourse(Course course) throws SQLException {
        sessionFactory.getCurrentSession().delete(course);
    }
}
