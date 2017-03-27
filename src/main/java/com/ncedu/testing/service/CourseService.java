package com.ncedu.testing.service;

import com.ncedu.testing.entity.Course;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ilya on 25.03.17.
 */
public interface CourseService {
    Course get(Long id) throws SQLException;

    void save(Course course) throws SQLException;

    void delete(Course course) throws SQLException;

    List<Course> findAll() throws SQLException;
}
