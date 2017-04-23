package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Course;
import com.ncedu.testing.entity.Result;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by maxim on 11.04.2017.
 */
public interface ResultDAO {
    void addResult(Result result) throws SQLException;

    void updateResult(Result result) throws SQLException;

    Result getResultById(Long id) throws SQLException;

    Collection<Result> getAllResults() throws SQLException;

    void deleteResult(Result result) throws SQLException;
}
