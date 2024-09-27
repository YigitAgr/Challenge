package com.challenge.demo.service;

import com.challenge.demo.Dto.CartDto;
import com.challenge.demo.Dto.ProductDto;
import com.challenge.demo.model.Cart;
import com.challenge.demo.model.Product;
import com.challenge.demo.repository.CartRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final ProductService productService;
    private final CartRepository cartRepository;
    private final CustomerService customerService;

    @Autowired
    public CartService(CartRepository cartRepository, ProductService productService,CustomerService customerService) {

        this.cartRepository = cartRepository;
        this.customerService= customerService;
        this.productService = productService;
    }


    public Cart AddProductToCart(int customerid, ProductDto productDto) {
        Cart cart = customerService.findById(customerid).getCart();
        System.out.println(cart);

        return cart;
    }


    public Product toProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        return product;
    }
}
