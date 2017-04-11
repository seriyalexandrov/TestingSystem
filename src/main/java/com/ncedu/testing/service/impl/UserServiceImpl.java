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

    @Override
    public void updateUser(Long id, User user) {
        User oldUser = this.get(id);

        if (user.getEmail() != null) {
            oldUser.setEmail(user.getEmail());
        }
        if (user.getName() != null) {
            oldUser.setName(user.getName());
        }
        if (user.getPassword() != null) {
            oldUser.setPassword(user.getPassword());
        }

        this.save(oldUser);
    }

    public void save(User user) {
        userDao.save(user);
    }
}
