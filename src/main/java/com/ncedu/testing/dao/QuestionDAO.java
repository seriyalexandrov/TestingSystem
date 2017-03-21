package com.ncedu.testing.dao;

import com.ncedu.testing.entity.Question;

import java.sql.SQLException;
import java.util.Collection;

public interface QuestionDAO {
    void addQuestion(Question question) throws SQLException;

    void updateQuestion(Question question) throws SQLException;

    Question getQuestionById(Long id) throws SQLException;

    Collection<Question> getAllQuestions() throws SQLException;

    void deleteQuestion(Question question) throws SQLException;
}
