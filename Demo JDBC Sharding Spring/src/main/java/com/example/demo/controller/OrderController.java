package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {
//    @Autowired
//    private OrderService orderService;
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public List<Order> getAllOrders(Order order) {
        return orderService.getAllOrders(order).stream()
                .sorted(Comparator.comparing(Order::getUserId)
                        .thenComparing(Order::getOrderId))
                .collect(Collectors.toList());
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        orderService.insertOrder(order);
    }
}
