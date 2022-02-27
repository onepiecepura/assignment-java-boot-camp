package com.example.week01.order;

import com.example.week01.product.Product;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "`ORDER`")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    @Lob
    private ArrayList<Product> orderItems;
    private Integer userId;
    private String paymentMethod;
    private String shippingAddress;
    private Double totalAmount;

    public Order() {
        orderItems = new ArrayList<>();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addOrderItem(Product item){
        orderItems.add(item);
    }

    public ArrayList<Product> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Product> orderItems) {
        this.orderItems = orderItems;
    }
}
