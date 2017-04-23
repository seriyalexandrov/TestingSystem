package com.ncedu.testing.service;

import com.ncedu.testing.entity.User;

import java.util.List;

public interface UserService {

    User get(Long id);

    void save(User userCommand);

    void delete(User user);

    List<User> findAll();

    User getUserByName(String name);
  
    void updateUser(Long id, User user);
}
