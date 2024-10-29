package com.example.demo.mapper;

import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> selectAllOrders(Order order);

    void insertOrder(Order order);
}
