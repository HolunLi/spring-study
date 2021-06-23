package com.holun.dao.impl;

import com.holun.dao.UserMapper;
import com.holun.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Transactional  基于注解实现声明式事务
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> queryAllUser() {
        User user = new User(9, "李神", "123456");
        addUser(user);
        deleteUserById(1);
        return getSqlSession().getMapper(UserMapper.class).queryAllUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
    }
}
