package com.example.test.controller;


import com.example.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    UserDao userDao;

    @GetMapping("/{id}")
    public void slect(@PathVariable Integer id){
        System.out.println(userDao.select(id));
    }
}
