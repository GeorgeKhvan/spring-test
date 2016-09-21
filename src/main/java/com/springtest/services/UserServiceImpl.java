package com.springtest.services;

import com.springtest.controllers.UserController;
import com.springtest.domain.User;
import com.springtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gekh on 8/23/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        //return null;
        //userRepository = new UserRepositoryImpl2();
        return userRepository.findOne(1);
    }

    public List<User> getAll (){
        return (List<User>) userRepository.findAll();
    }
}
