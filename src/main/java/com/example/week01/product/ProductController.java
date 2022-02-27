package com.example.week01.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ProductsResponse searchProducts(@RequestParam String name){
        return productService.searchByName(name);
    }

    @GetMapping("/products/{id}")
    public ProductDetailResponse getProductById(@PathVariable Integer id){
        return  productService.findById(id);
    }
}
