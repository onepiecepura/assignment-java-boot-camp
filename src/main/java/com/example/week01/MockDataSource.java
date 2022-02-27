package com.example.week01;

import com.example.week01.product.Product;
import com.example.week01.user.User;

public  class MockDataSource {

    public static Product getProduct1(){
        Product product = new Product();
        product.setId(1);
        product.setName("Adidas Yeezy Boost 350 V2");
        product.setDescription("New arrival Beluga 2.0(AH2203)");
        product.setCategory("sneakers");
        product.setBrand("Adidas");
        product.setPrice(28900.00);
        product.setImage("/img/adidas_halo_lvory.jpg");
        product.setSize(43);
        return product;
    }

    public static Product getProduct2(){
        Product product = new Product();
        product.setId(2);
        product.setName("Onitsuka Tiger MEXICO 66 SLIP-ON");
        product.setDescription("A lace-free upgrade to an Onitsuka Tiger classic, the MEXICO 66 SLIP-ON");
        product.setCategory("sport sneakers");
        product.setBrand("Onitsuka Tiger");
        product.setPrice(3500.00);
        product.setImage("/img/onitsuka_mexico_66.jpg");
        product.setSize(40);
        return product;
    }

    public static User getUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("onepiecepura");
        user.setAddress("4028 Stanley Avenue, Garden City, New York");
        return user;
    }

}
