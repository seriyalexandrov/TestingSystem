package com.hibernate.skill.checker.dao.layers;

import com.hibernate.skill.checker.dao.layers.DAOimpl.UserDAO;
import com.ncedu.testing.entity.dao.User;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dreikaa on 2/20/17.
 */
public class UserDAOImpl implements UserDAO{
    private Session session;

    public UserDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void addUser(User course) throws SQLException {
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
    }

    public void updateUser(User course) throws SQLException {
        session.beginTransaction();
        session.update(course);
        session.getTransaction().commit();
    }

    public User getUserById(Long id) throws SQLException {
        User course = null;
        course = (User) session.load(User.class, id);
        return course;
    }

    public Collection<User> getAllUsers() throws SQLException {
        List<User> course = new ArrayList<User>();
        course = session.createCriteria(User.class).list();
        return course;
    }

    public void deleteUser(User course) throws SQLException {
        session.beginTransaction();
        session.delete(course);
        session.getTransaction().commit();
    }
}
