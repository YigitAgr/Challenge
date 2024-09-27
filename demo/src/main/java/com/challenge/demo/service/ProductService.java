package com.challenge.demo.service;

import com.challenge.demo.Dto.ProductDto;
import com.challenge.demo.model.Product;
import com.challenge.demo.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
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
        return productRepository.findById(id);
    }



    public Product CreateProduct(ProductDto productDto) {

        Product product = toProduct(productDto);

        if(product == null) {
            throw new IllegalArgumentException("Fields cant be empty");
        }
        return productRepository.save(product);
    }




    public Product UpdateProduct(ProductDto productDto) {
        Product product =productRepository.findById(productDto.getId());
        if(product == null) {
            throw new IllegalArgumentException("There is no product");
        }
        product = toProduct(productDto);
        productRepository.save(product);
        return product;
    }



    public Product toProduct(ProductDto productDto) {
        System.out.println(productDto);
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        return product;
    }


    public void DeleteProduct(int id) {
        Product product = productRepository.findById(id);
        if(product==null) {
            throw new EntityNotFoundException("There is no product");
        }
        else {
            productRepository.delete(product);
        }

    }
}
