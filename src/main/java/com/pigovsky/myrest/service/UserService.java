package com.pigovsky.myrest.service;

import com.pigovsky.myrest.model.Result;
import com.pigovsky.myrest.model.User;

import java.util.List;

/**
 * Created by yuriy on 30.04.15.
 */
public interface UserService {
    User createUser(User user);

    Iterable<User> getUsers();

    User getUser(Long id);

    User updateUser(Long id, User userPatch);

    Result deleteUser(Long id);
}
