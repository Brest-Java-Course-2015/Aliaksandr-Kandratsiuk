package com.epam.brest.course2015.dao;

import com.epam.brest.course2015.domain.User;

import java.util.List;

/**
 * Created by juga on 7.10.15.
 */
public interface UserDao {

    public List<User> getAllUsers();

    public User getUserById(Integer userId);

    public User getUserByLogin(String login);

    public Integer getCountUsers(String login);

    public Integer getTotalUsersCount();

    public Integer addUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer userId);

}
