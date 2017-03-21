package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Test;

import java.sql.SQLException;
import java.util.Collection;

public interface TestDAO {
    public void addTest(Test test) throws SQLException;

    public void updateTest(Test test) throws SQLException;

    public Test getTestById(Long id) throws SQLException;

    public Collection<Test> getAllTests() throws SQLException;

    public void deleteTest(Test test) throws SQLException;
}
