package com.devil.service.impl;

import com.devil.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName：UserServiceImpl
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加");
        System.out.println(1/0);
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void query() {
        System.out.println("查找");
    }
}
