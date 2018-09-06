package com.test.service;
import com.test.model.User;

public interface UserService {
    User selectUserById(Integer userId);
}
