package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Course;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by dreikaa on 2/20/17.
 */
public interface CourseDAO {
    public void addCourse(Course course) throws SQLException;

    public void updateCourse(Course course) throws SQLException;

    public Course getCourseById(Long id) throws SQLException;

    public Collection<Course> getAllCourses() throws SQLException;

    public void deleteCourse(Course course) throws SQLException;
}
