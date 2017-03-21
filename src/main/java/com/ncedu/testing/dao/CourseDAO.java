package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Course;

import java.sql.SQLException;
import java.util.Collection;

public interface CourseDAO {
    void addCourse(Course course) throws SQLException;

    void updateCourse(Course course) throws SQLException;

    Course getCourseById(Long id) throws SQLException;

    Collection<Course> getAllCourses() throws SQLException;

    void deleteCourse(Course course) throws SQLException;
}
