package com.example.springbootvue.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootvue.common.QueryPageParam;
import com.example.springbootvue.common.Result;
import com.example.springbootvue.entity.Pdh3113_book;
import com.example.springbootvue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2023-11-25
 */
@RestController
@RequestMapping("/book")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public List<Pdh3113_book> list(){
        return userService.list();
    }

    //新增
    //Request
    @PostMapping("/save")
    public Result save(@RequestBody Pdh3113_book pdh3113_book){

        return userService.save(pdh3113_book)?Result.suc():Result.fail();
    }

    //更新
    @PostMapping("/update")
    public Result update(@RequestBody Pdh3113_book pdh3113_book){

        return userService.updateById(pdh3113_book)?Result.suc():Result.fail();
    }

    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody Pdh3113_book pdh3113_book){
        return userService.updateById(pdh3113_book);
    }

    //新增或修改
    @PostMapping("/saveOrMod")
    public Result saveOrMod(@RequestBody Pdh3113_book pdh3113_book){
        return userService.saveOrUpdate(pdh3113_book)?Result.suc():Result.fail();
    }

    //删除
    @GetMapping("/delete")
    public Result delete(@RequestParam Integer id){
        System.out.println(123123);
        return userService.removeById(id)?Result.suc():Result.fail();
    }

    //查询（模糊）
    @PostMapping("/listP")
    public Result ListP(@RequestBody Pdh3113_book pdh3113_book){
        LambdaQueryWrapper<Pdh3113_book> lambdaQueryWrapper = new LambdaQueryWrapper();

        if(StringUtils.isNotBlank(pdh3113_book.getName())){
            lambdaQueryWrapper.like(Pdh3113_book::getName, pdh3113_book.getName());
        }

        return Result.suc(userService.list(lambdaQueryWrapper));
    }

    @PostMapping("/listPage")
   // public List<User> listPage(@RequestBody HashMap map){
    public List<Pdh3113_book> listPage(@RequestBody QueryPageParam query){
        //System.out.println(param);
        /*LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(User::getName,user.getName());

        return userService.list(lambdaQueryWrapper);*/
        HashMap param = query.getParam();
        String name = (String) param.get("name");

        Page<Pdh3113_book> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<Pdh3113_book> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Pdh3113_book::getName,name);

        IPage result = userService.page(page,lambdaQueryWrapper);

        System.out.println("total=="+result.getTotal());

        System.out.println(result.getRecords());

        return result.getRecords();

    }

    @PostMapping("/listCPage")
    // public List<User> listPage(@RequestBody HashMap map){
    public Result listCPage(@RequestBody QueryPageParam query){
        //System.out.println(param);
        /*LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(User::getName,user.getName());

        return userService.list(lambdaQueryWrapper);*/
        HashMap param = query.getParam();
        String name = (String) param.get("name");
        String sex = (String) param.get("sex");

        Page<Pdh3113_book> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());
//        System.out.println("NOW："+query.getPageNum());
//        System.out.println("NOW2："+query.getPageSize());

        LambdaQueryWrapper<Pdh3113_book> lambdaQueryWrapper = new LambdaQueryWrapper();
        if(StringUtils.isNotBlank(name)&&!"".equals(name)){
            lambdaQueryWrapper.like(Pdh3113_book::getName,name);
        }
//        if(StringUtils.isNotBlank(sex)){
//            lambdaQueryWrapper.eq(Book::getSex,sex);
//        }


        IPage result = userService.page(page,lambdaQueryWrapper);

        return Result.suc(result.getRecords(), result.getTotal());

    }

}
