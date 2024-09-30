package com.example.springboot_01_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @GetMapping("/{id}")
    public String getByid(@PathVariable Integer id){
        System.out.println("id:"+id);
        return "hello Springboot!";
    }
}
