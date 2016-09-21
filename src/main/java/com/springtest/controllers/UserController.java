package com.springtest.controllers;

import com.springtest.domain.User;
import com.springtest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gekh on 8/23/2016.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById (@PathVariable Long id){
        return userService.getUser(id);
    }

    @RequestMapping (value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.getAll();
    }
}
