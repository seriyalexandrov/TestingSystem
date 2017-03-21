package com.ncedu.testing.dao.impl;

import com.ncedu.testing.dao.TestDAO;
import com.ncedu.testing.entity.Test;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collection;

@Transactional
@Repository
public class TestDAOImpl implements TestDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addTest(Test course) throws SQLException {
        sessionFactory.getCurrentSession().save(course);
    }

    public void updateTest(Test course) throws SQLException {
        sessionFactory.getCurrentSession().update(course);
    }

    public Test getTestById(Long id) throws SQLException {
        return (Test) sessionFactory.getCurrentSession().load(Test.class, id);
    }

    public Collection<Test> getAllTests() throws SQLException {
        return sessionFactory.getCurrentSession().createCriteria(Test.class).list();
    }

    public void deleteTest(Test course) throws SQLException {
        sessionFactory.getCurrentSession().delete(course);
    }
}
