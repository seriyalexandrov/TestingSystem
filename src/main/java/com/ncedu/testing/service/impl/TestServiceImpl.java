package com.ncedu.testing.service.impl;

import com.ncedu.testing.dao.TestDAO;
import com.ncedu.testing.dao.TestDAO;
import com.ncedu.testing.entity.Test;
import com.ncedu.testing.entity.Test;
import com.ncedu.testing.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDAO testDAO;

    @Override
    public Test get(Long id) throws SQLException {
        return testDAO.getTestById(id);
    }

    @Override
    public void save(Test Test) throws SQLException {
        testDAO.addTest(Test);
    }

    @Override
    public void delete(Test Test) throws SQLException {
        testDAO.deleteTest(Test);
    }

    @Override
    public List<Test> findAll() throws SQLException {
        return (List<Test>) testDAO.getAllTests();
    }
}
