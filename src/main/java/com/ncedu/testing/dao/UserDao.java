package com.ncedu.testing.dao;

import com.ncedu.testing.entity.User;

import java.util.List;

public interface UserDao {

    User get(Long id);

    void save(User user);

    void delete(User user);

    List<User> findAll();

    User findByUserName(String username);

}
