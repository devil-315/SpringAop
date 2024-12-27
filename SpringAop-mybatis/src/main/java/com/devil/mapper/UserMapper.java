package com.devil.mapper;

import com.devil.entity.User;

import java.util.List;

/**
 * ClassName：UserMapper
 *
 * @author: Devil
 * @Date: 2024/9/10
 * @Description:
 * @version: 1.0
 */
public interface UserMapper {
    List<User> getUsers();

    int addUser(User user);

    int deleteUser(int id);
}
