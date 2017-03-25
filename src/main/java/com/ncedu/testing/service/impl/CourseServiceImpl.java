package com.ncedu.testing.service.impl;

import com.ncedu.testing.dao.CourseDAO;
import com.ncedu.testing.entity.Course;
import com.ncedu.testing.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ilya on 25.03.17.
 */

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDAO courseDao;

    @Override
    public Course get(Long id) throws SQLException {
        return courseDao.getCourseById(id);
    }

    @Override
    public void save(Course course) throws SQLException {
        courseDao.addCourse(course);
    }

    @Override
    public void delete(Course course) throws SQLException {
        courseDao.deleteCourse(course);
    }

    @Override
    public List<Course> findAll() throws SQLException {
        return (List<Course>) courseDao.getAllCourses();
    }

}
