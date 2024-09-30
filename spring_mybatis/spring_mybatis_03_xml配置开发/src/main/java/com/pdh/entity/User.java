package com.pdh.entity;

import java.util.List;

public class User {

    private String id;
    private String psw;
    //    描述当前用户存在哪些订单
    private List<Orders> orderList;
    //描述当前用户具备哪些角色
    private  List<Role> roleList;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", psw='" + psw + '\'' +
                ", orderList=" + orderList +
                ", roleList=" + roleList +
                '}';
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> ordersList) {
        this.orderList = ordersList;
    }







    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
