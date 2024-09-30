package com.pdh.mapper;

import com.pdh.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper{
    @Insert("insert into user values (#{id},#{psw})")
    public void save(User user);
    @Update("update user user set psw=#{psw} where id =#{id")
    public void updata(User user);


    public void delete(int id);

    public User findById(int id);

    @Select("select * from user")
    public List<User> findAll();

}
