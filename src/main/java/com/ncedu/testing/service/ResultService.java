package com.ncedu.testing.service;

import com.ncedu.testing.entity.Result;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
public interface ResultService {
    Result get(Long id) throws SQLException;

    void save(Result result) throws SQLException;

    void delete(Result result) throws SQLException;

    List<Result> findAll() throws SQLException;
}
