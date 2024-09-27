package com.challenge.demo.service;

import com.challenge.demo.Dto.CartDto;
import com.challenge.demo.Dto.CustomerDto;
import com.challenge.demo.model.Cart;
import com.challenge.demo.model.Customer;
import com.challenge.demo.repository.CartRepository;
import com.challenge.demo.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class CustomerService {

    private final CartRepository cartRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }


    public Customer AddCustomer(CustomerDto customerDto) {
        Customer customer = toCustomer(customerDto);
        Cart cart = new Cart();
        customer.setCart(cart);
        cart.setCustomer(customer);
        customerRepository.save(customer);
        cartRepository.save(cart);
        return customer;
    }


    public Cart GetCart(int customerid) {
        Optional<Customer> customer = customerRepository.findById(customerid);
        if(customer.isPresent()) {
            System.out.println(customer.get().getCart());
            Cart cart = customer.get().getCart();
            System.out.println(cart);
            return cart;
        }else {
            throw new EntityNotFoundException("Customer Or Cart not found");
        }
    }


    public Customer findById(int customerid) {
        return customerRepository.findById(customerid).orElse(null);

    }




    public Customer toCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        if (customerDto.getFirstName() == null || customerDto.getFirstName().isEmpty()) {
            throw new IllegalArgumentException("Firstname is required");
        } else {
            customer.setFirstName(customerDto.getFirstName());
        }
        return customer;
    }

    public CustomerDto toCustomerDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());

        customerDto.setFirstName(customer.getFirstName());

        return customerDto;
    }



}
