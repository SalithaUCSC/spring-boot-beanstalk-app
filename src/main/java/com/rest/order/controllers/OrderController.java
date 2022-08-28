package com.rest.order.controllers;

import com.rest.order.entities.Order;
import com.rest.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok().body(orderService.getOrders());
    }

    @PostMapping(path = "/orders")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        Order newOrder = orderService.createOrder(order);
        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
    }
}
