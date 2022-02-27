package com.example.week01.order;

import com.example.week01.product.ProductDetailResponse;
import com.example.week01.user.User;

import java.util.List;


public class OrderResponse{
	private Integer id;
	private User user;
	private String shippingAddress;
	private String paymentMethod;
	private List<ProductDetailResponse> orderItems;

	public OrderResponse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public List<ProductDetailResponse> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<ProductDetailResponse> orderItems) {
		this.orderItems = orderItems;
	}
}