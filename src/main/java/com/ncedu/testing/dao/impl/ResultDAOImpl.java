package com.ncedu.testing.dao.impl;

import com.ncedu.testing.dao.ResultDAO;
import com.ncedu.testing.entity.Result;
import com.ncedu.testing.entity.Test;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by maxim on 11.04.2017.
 */
@Transactional
@Repository
public class ResultDAOImpl implements ResultDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addResult(Result result) throws SQLException {
        sessionFactory.getCurrentSession().save(result);
    }

    public void updateResult(Result result) throws SQLException {
        sessionFactory.getCurrentSession().update(result);
    }

    public Result getResultById(Long id) throws SQLException {
        return (Result) sessionFactory.getCurrentSession().load(Result.class, id);
    }

    public Collection<Result> getAllResults() throws SQLException {
        return sessionFactory.getCurrentSession().createCriteria(Result.class).list();
    }

    public void deleteResult(Result result) throws SQLException {
        sessionFactory.getCurrentSession().delete(result);
    }
}
