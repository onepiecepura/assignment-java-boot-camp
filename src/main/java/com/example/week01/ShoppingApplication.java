package com.example.week01;

import com.example.week01.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init() {
        mock_products();
    }

    private void mock_products() {
        productRepository.save(MockDataSource.getProduct1());
        productRepository.save(MockDataSource.getProduct2());
    }

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }



}
