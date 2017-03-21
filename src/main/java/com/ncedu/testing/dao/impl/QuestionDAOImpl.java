package com.ncedu.testing.dao.impl;

import com.ncedu.testing.dao.QuestionDAO;
import com.ncedu.testing.entity.Question;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collection;

@Transactional
@Repository
public class QuestionDAOImpl implements QuestionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addQuestion(Question question) throws SQLException {
        sessionFactory.getCurrentSession().save(question);
    }

    public void updateQuestion(Question question) throws SQLException {
        sessionFactory.getCurrentSession().update(question);
    }

    public Question getQuestionById(Long id) throws SQLException {
        return (Question) sessionFactory.getCurrentSession().load(Question.class, id);
    }

    public Collection<Question> getAllQuestions() throws SQLException {
        return sessionFactory.getCurrentSession().createCriteria(Question.class).list();
    }

    public void deleteQuestion(Question question) throws SQLException {
        sessionFactory.getCurrentSession().delete(question);
    }
}
