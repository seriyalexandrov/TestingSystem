package com.ncedu.testing.service.impl;

import com.ncedu.testing.dao.ResultDAO;
import com.ncedu.testing.entity.Result;
import com.ncedu.testing.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    ResultDAO resultDAO;

    @Override
    public Result get(Long id) throws SQLException {
        return resultDAO.getResultById(id);
    }

    @Override
    public void save(Result Result) throws SQLException {
        resultDAO.addResult(Result);
    }

    @Override
    public void delete(Result Result) throws SQLException {
        resultDAO.deleteResult(Result);
    }

    @Override
    public List<Result> findAll() throws SQLException {
        return (List<Result>) resultDAO.getAllResults();
    }
}
