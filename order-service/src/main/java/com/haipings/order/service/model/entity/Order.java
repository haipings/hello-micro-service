package com.haipings.order.service.model.entity;

import java.util.List;

public class Order {

    private Integer id;

    private String orderNo;

    private Double totalPrice;

    private List<Product> productList;

    public Order() {
    }

    public Order(Integer id, String orderNo, Double totalPrice, List<Product> productList) {
        this.id = id;
        this.orderNo = orderNo;
        this.totalPrice = totalPrice;
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
