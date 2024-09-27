package com.challenge.demo.controller;

import com.challenge.demo.Dto.ProductDto;
import com.challenge.demo.model.Product;
import com.challenge.demo.repository.ProductRepository;
import com.challenge.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/Createproduct")
    public Product CreateProduct(@RequestBody ProductDto productDto){
        return productService.CreateProduct(productDto);
    }


    @PutMapping("/Updateproduct")
    public Product UpdateProduct(@RequestBody ProductDto productDto){
        return productService.UpdateProduct(productDto);
    }

    @DeleteMapping("/deleteproduct")
    public void DeleteProduct(@RequestParam int id){
        productService.DeleteProduct(id);
    }


}
