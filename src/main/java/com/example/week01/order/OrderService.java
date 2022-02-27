package com.example.week01.order;

import com.example.week01.product.Product;
import com.example.week01.product.ProductDetailResponse;
import com.example.week01.product.ProductRepository;
import com.example.week01.user.User;
import com.example.week01.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    private User getUser(int userId){
        Optional<User> user = userRepository.findById(userId);
        return user.get();
    }

    private Product getProduct(int productId){
        Optional<Product> product = productRepository.findById(productId);
        return product.get();
    }

    public OrderResponse createOrder(OrderRequest orderRequest){
        User user = getUser(orderRequest.getUserId());
        Product product = getProduct(orderRequest.getProductId());

        Order order = new Order();
        order.setId(1);
        order.setUserId(user.getId());
        order.setPaymentMethod("credit");
        order.setShippingAddress(user.getAddress());
        order.setTotalAmount(product.getPrice());
        order.addOrderItem(product);
        Order model = orderRepository.save(order);

        OrderResponse order_response = new OrderResponse();
        order_response.setUser(user);
        order_response.setShippingAddress(model.getShippingAddress());
        order_response.setPaymentMethod(model.getPaymentMethod());

        ArrayList<ProductDetailResponse> orderItems = new ArrayList<>();
        for (Product orderItem: model.getOrderItems()){
            orderItems.add(new ProductDetailResponse(orderItem));
        }
        order_response.setOrderItems(orderItems);
        return order_response;
    }

}
