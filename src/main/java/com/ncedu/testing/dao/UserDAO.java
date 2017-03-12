package com.ncedu.testing.dao;

import com.ncedu.testing.entity.User;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by dreikaa on 2/20/17.
 */
public interface UserDAO {

    public void addUser(User user) throws SQLException;

    public void updateUser(User user) throws SQLException;

    public User getUserById(Long id) throws SQLException;

    public Collection<User> getAllUsers() throws SQLException;

    public void deleteUser(User user) throws SQLException;
}

