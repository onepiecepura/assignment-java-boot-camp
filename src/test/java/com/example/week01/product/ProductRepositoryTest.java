package com.example.week01.product;

import com.example.week01.MockDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void searchProductByNameTest(){
        Product product = MockDataSource.getProduct2();
        productRepository.save(MockDataSource.getProduct1());
        productRepository.save(product);

        List<Product> actual = productRepository.findProductByNameContains("Onitsuka");

        assertEquals(product.getName(), actual.get(0).getName());
        assertEquals(product.getPrice(), actual.get(0).getPrice());
        assertEquals(1, actual.size());

    }
}
