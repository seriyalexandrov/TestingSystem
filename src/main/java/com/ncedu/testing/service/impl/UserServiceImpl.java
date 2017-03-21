package com.ncedu.testing.service.impl;

import com.ncedu.testing.dao.UserDao;
import com.ncedu.testing.entity.User;
import com.ncedu.testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User get(Long id) {
        return userDao.get(id);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }
}
