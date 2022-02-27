package com.example.week01.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductsResponse searchByName(String name){
        return new ProductsResponse(productRepository.findProductByNameContains(name));
    }

    public ProductDetailResponse findById(Integer id){
        Optional<Product> product = productRepository.findById(id);
        return new ProductDetailResponse(product.get());
    }

}
