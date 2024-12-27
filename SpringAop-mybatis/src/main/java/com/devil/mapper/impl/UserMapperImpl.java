package com.devil.mapper.impl;

import com.devil.entity.User;
import com.devil.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName：UserMapperImpl
 *
 * @author: Devil
 * @Date: 2024/9/10
 * @Description:
 * @version: 1.0
 */
@Repository
public class UserMapperImpl implements UserMapper {
    /*
   TODO 在之前，所有的操作都是使用 sqlSession
         现在都是用sqlSessiontemple
    */
    @Autowired //自动注入
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(13, "LILI", "123123");
        mapper.addUser(user);
        //此时插入成功，但是深处失败，但是在真实的业务场景中。应该保存事务的原子性，加入事务
        int a  = 1/0;
        mapper.deleteUser(14);
        return   mapper.getUsers();
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
