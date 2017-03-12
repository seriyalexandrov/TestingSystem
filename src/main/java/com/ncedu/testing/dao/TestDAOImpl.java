package com.ncedu.testing.dao;

import com.ncedu.testing.entity.HibernateUtil;
import com.ncedu.testing.entity.Test;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dreikaa on 2/20/17.
 */
public class TestDAOImpl implements TestDAO {
    private Session session;

    public TestDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void addTest(Test course) throws SQLException {
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
    }

    public void updateTest(Test course) throws SQLException {
        session.beginTransaction();
        session.update(course);
        session.getTransaction().commit();
    }

    public Test getTestById(Long id) throws SQLException {
        Test course = null;
        course = (Test) session.load(Test.class, id);
        return course;
    }

    public Collection<Test> getAllTests() throws SQLException {
        List<Test> course = new ArrayList<Test>();
        course = session.createCriteria(Test.class).list();
        return course;
    }

    public void deleteTest(Test course) throws SQLException {
        session.beginTransaction();
        session.delete(course);
        session.getTransaction().commit();
    }
}
