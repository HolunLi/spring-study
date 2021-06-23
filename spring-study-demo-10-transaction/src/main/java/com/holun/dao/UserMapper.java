package com.holun.dao;

import com.holun.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUser();

    int addUser(User user);

    int deleteUserById(@Param("id") int id);
}
