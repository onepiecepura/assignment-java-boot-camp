package com.example.week01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductsResponse searchByName(String name){
        return new ProductsResponse(productRepository.findProductByNameContains(name));
    }

}
