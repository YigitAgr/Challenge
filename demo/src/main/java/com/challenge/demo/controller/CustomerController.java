package com.challenge.demo.controller;

import com.challenge.demo.Dto.CartDto;
import com.challenge.demo.Dto.CustomerDto;
import com.challenge.demo.model.Cart;
import com.challenge.demo.model.Customer;
import com.challenge.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("addcustomer")
    public Customer AddCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.AddCustomer(customerDto);
    }

    @GetMapping("/getcart")
    public Cart GetCart(@RequestParam int customerid) {
        return customerService.GetCart(customerid);
    }


}
