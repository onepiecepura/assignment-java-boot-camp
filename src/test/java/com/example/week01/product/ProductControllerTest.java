package com.example.week01.product;

import com.example.week01.MockDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void searchProductsByNameTest(){
        // Arrange
        Product product = MockDataSource.getProduct1();
        when(productRepository.findProductByNameContains("Adidas")).thenReturn(List.of(product));


        // Act
        ProductsResponse result = testRestTemplate.getForObject("/products?name=Adidas", ProductsResponse.class);
        Product actual = result.getProducts().get(0);

        assertEquals(product.getId(), actual.getId());
        assertEquals(product.getName(), actual.getName());
        assertEquals(product.getPrice(), actual.getPrice());
        assertEquals(1, result.getProducts().size());
    }

    @Test
    void findProductByIdTest(){
        Product product = MockDataSource.getProduct1();
        when(productRepository.findById(1)).thenReturn(Optional.of(product));

        ProductDetailResponse actual = testRestTemplate.getForObject("/products/1", ProductDetailResponse.class);

        assertEquals(product.getId(), actual.getId());
        assertEquals(product.getName(), actual.getName());
        assertEquals(product.getPrice(), actual.getPrice());
        assertEquals(product.getImage(), actual.getImage());
        assertEquals(product.getSize(), actual.getSize());
    }

}
