package com.pigovsky.myrest.service;

import com.pigovsky.myrest.model.Result;
import com.pigovsky.myrest.model.User;
import com.pigovsky.myrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuriy on 30.04.15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User updateUser(Long id, User userPatch) {
        User user = getUser(id);
        if (userPatch.getAddress()!=null){
            user.setAddress(userPatch.getAddress());
        }
        if (userPatch.getFirstName()!=null){
            user.setFirstName(userPatch.getFirstName());
        }
        if (userPatch.getLastName()!=null){
            user.setLastName(userPatch.getLastName());
        }
        return userRepository.save(user);
    }

    @Override
    public Result deleteUser(Long id) {
        userRepository.delete(id);
        Result result = new Result();
        result.setSuccess(true);
        result.setMessage("Removed");
        return result;
    }
}
