package com.pdh.mapper;

import com.pdh.entity.Orders;

import java.util.List;

public interface OrderMapper {
    List<Orders> findAll();
}
