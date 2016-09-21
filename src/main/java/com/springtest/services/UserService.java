package com.springtest.services;

import com.springtest.domain.User;

import java.util.List;

/**
 * Created by gekh on 8/23/2016.
 */
public interface UserService {
    User getUser(Long id);

    List<User> getAll();
}
