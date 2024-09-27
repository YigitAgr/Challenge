package com.challenge.demo.controller;

import com.challenge.demo.model.Order;
import com.challenge.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    /*TODO
    public Order placeOrder(Order order) {

    };


    public Order GetOrderForCode() {}


    public Order GetAllOrdersForCustomer() {}*/

}
