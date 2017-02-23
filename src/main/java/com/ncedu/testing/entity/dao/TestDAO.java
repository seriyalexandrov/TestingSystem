package com.hibernate.skill.checker.dao.layers.DAOimpl;

import com.hibernate.skill.checker.entitys.Test;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by dreikaa on 2/20/17.
 */
public interface TestDAO {
    public void addTest(Test test) throws SQLException;

    public void updateTest(Test test) throws SQLException;

    public Test getTestById(Long id) throws SQLException;

    public Collection<Test> getAllTests() throws SQLException;

    public void deleteTest(Test test) throws SQLException;
}
