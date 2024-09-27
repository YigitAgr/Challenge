package com.challenge.demo.controller;

import com.challenge.demo.model.Product;
import com.challenge.demo.repository.ProductRepository;
import com.challenge.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/Getproduct")
    public Product GetProduct(@RequestParam int id) {


        return productService.GetProduct(id);
    }

   /* @PostMapping("/createproduct")
    public Product CreateProduct(ProductDto productDto){
        return null;
    }

    @PostMapping("/updateproduct")
    public Product UpdateProduct(ProductDto productDto){
        return null;
    }

    @DeleteMapping("/deleteproduct")
    public Product DeleteProduct(){
        return null;
    }*/


}
