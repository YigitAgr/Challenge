package com.challenge.demo.service;

import com.challenge.demo.model.Product;
import com.challenge.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public Product GetProduct(int id) {
        return productRepository;
    }
}
