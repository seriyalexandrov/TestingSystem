package com.ncedu.testing.service;

import com.ncedu.testing.entity.Course;
import com.ncedu.testing.entity.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
public interface TestService {
    Test get(Long id) throws SQLException;

    void save(Test test) throws SQLException;

    void delete(Test test) throws SQLException;

    List<Test> findAll() throws SQLException;
}
