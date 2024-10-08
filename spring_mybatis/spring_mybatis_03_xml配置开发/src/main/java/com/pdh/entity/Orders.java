package com.pdh.entity;

import java.util.Date;

public class Orders {

    private int id;
    private Date ordertime;
    private int total;

//    表示当前用户属于哪一个用户
    private User user;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
