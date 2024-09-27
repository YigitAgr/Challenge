package com.challenge.demo.controller;

import com.challenge.demo.Dto.CartDto;
import com.challenge.demo.Dto.ProductDto;
import com.challenge.demo.model.Cart;
import com.challenge.demo.model.Product;
import com.challenge.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

    private final CartService cartService;


    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @PutMapping("/Addproducttocart")
    public Cart AddProductToCart(@RequestParam int customerid,@RequestBody ProductDto productDto) {
        return cartService.AddProductToCart(customerid,productDto);
    }

    @DeleteMapping("/Removeproductfromcart")
    public Cart RemoveProductFromCart(CartDto cartDto, ProductDto productDto) {
        return null;
    }

}
