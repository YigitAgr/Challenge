package com.challenge.demo.service;

import com.challenge.demo.Dto.CustomerDto;
import com.challenge.demo.model.Customer;
import com.challenge.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer AddCustomer(CustomerDto customerDto) {
        Customer customer = toCustomer(customerDto);
        return customerRepository.save(customer);
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
