package com.test.dao;
import com.test.model.User;

public interface UserDao {
    public User selectUserById(Integer userId);
}
