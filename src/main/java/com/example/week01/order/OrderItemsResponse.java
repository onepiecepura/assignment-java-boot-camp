package com.example.week01.order;

import com.example.week01.product.ProductDetailResponse;

import java.util.List;

public class OrderItemsResponse {
    private Integer id;
    private List<ProductDetailResponse> products;
    private Double amount;

    public OrderItemsResponse() {
    }

}
