package com.ncedu.testing.service.impl;

import com.ncedu.testing.dao.QuestionDAO;
import com.ncedu.testing.entity.Question;
import com.ncedu.testing.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by maxim on 11.04.2017.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionDAO questionDAO;

    @Override
    public Question get(Long id) throws SQLException {
        return questionDAO.getQuestionById(id);
    }

    @Override
    public void save(Question Question) throws SQLException {
        questionDAO.addQuestion(Question);
    }

    @Override
    public void delete(Question Question) throws SQLException {
        questionDAO.deleteQuestion(Question);
    }

    @Override
    public List<Question> findAll() throws SQLException {
        return (List<Question>) questionDAO.getAllQuestions();
    }
}
