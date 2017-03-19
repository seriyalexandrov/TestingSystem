package com.ncedu.testing.dao;

import com.ncedu.testing.entity.HibernateUtil;
import com.ncedu.testing.entity.Question;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dreikaa on 2/20/17.
 */
public class QuestionDAOImpl implements QuestionDAO {
    private Session session;

    public QuestionDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void addQuestion(Question question) throws SQLException {
        session.beginTransaction();
        session.save(question);
        session.getTransaction().commit();
    }

    public void updateQuestion(Question question) throws SQLException {
        session.beginTransaction();
        session.update(question);
        session.getTransaction().commit();
    }

    public Question getQuestionById(Long id) throws SQLException {
        Question question = null;
        question = (Question) session.load(Question.class, id);
        return question;
    }

    public Collection<Question> getAllQuestions() throws SQLException {
        List<Question> question = new ArrayList<Question>();
        question = session.createCriteria(Question.class).list();
        return question;
    }

    public void deleteQuestion(Question question) throws SQLException {
        session.beginTransaction();
        session.delete(question);
        session.getTransaction().commit();
    }
}
