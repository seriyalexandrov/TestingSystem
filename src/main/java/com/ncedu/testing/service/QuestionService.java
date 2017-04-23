package com.ncedu.testing.service;

import com.ncedu.testing.entity.Question;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
public interface QuestionService {
    Question get(Long id) throws SQLException;

    void save(Question question) throws SQLException;

    void delete(Question question) throws SQLException;

    List<Question> findAll() throws SQLException;
}
