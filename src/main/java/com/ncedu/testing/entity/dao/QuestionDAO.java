package com.ncedu.testing.entity.dao;

import com.ncedu.testing.entity.Question;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by dreikaa on 2/20/17.
 */
public interface QuestionDAO {
    public void addQuestion(Question question) throws SQLException;

    public void updateQuestion(Question question) throws SQLException;

    public Question getQuestionById(Long id) throws SQLException;

    public Collection<Question> getAllQuestions() throws SQLException;

    public void deleteQuestion(Question question) throws SQLException;
}
