package com.pdh.mapper;

import com.pdh.entity.User;

import java.util.List;

public interface UserMapper{

    List<User> findAll();

    List<User> findUserAndRoleAll();

}
