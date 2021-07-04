package com.anthem.service;


import com.anthem.entity.User;
import com.anthem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserService implements UserMapper {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
       return userMapper.queryUserList();
    }

    @Override
    public User queryUserById() {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
