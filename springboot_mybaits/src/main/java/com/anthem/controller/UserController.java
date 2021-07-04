package com.anthem.controller;

import com.anthem.entity.User;
import com.anthem.mapper.UserMapper;
import com.anthem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userListr = userService.queryUserList();
        return userListr;
    }
}
