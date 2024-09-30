package com.example.test.dao;

import com.example.test.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from tbl_book where id =#{id}")
    public Book select(Integer id);
}
