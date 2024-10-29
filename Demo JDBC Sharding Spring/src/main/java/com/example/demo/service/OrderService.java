package com.example.demo.service;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

//    @Autowired
//    private OrderMapper orderMapper;

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Order> getAllOrders(Order order) {
        return orderMapper.selectAllOrders(order);
    }

    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }
}
