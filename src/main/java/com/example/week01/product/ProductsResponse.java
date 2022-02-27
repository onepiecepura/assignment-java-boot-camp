package com.example.week01.product;

import java.util.List;

public class ProductsResponse {

    public ProductsResponse() {
    }

    public ProductsResponse(List<Product> products) {
        this.products = products;
    }

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}