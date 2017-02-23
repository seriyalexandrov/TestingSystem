package com.ncedu.testing.entity.dao;

import com.ncedu.testing.entity.Course;
import com.ncedu.testing.entity.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dreikaa on 2/20/17.
 */
public class CourseDAOImpl implements CourseDAO {
    private Session session;

    public CourseDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void addCourse(Course course) throws SQLException {
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
    }

    public void updateCourse(Course course) throws SQLException {
        session.beginTransaction();
        session.update(course);
        session.getTransaction().commit();
    }

    public Course getCourseById(Long id) throws SQLException {
        Course course = null;
        course = (Course) session.load(Course.class, id);
        return course;
    }

    public Collection<Course> getAllCourses() throws SQLException {
        List<Course> course = new ArrayList<Course>();
        course = session.createCriteria(Course.class).list();
        return course;
    }

    public void deleteCourse(Course course) throws SQLException {
        session.beginTransaction();
        session.delete(course);
        session.getTransaction().commit();
    }
}
