package com.anthem.mapper;

import com.anthem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById();
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
}
