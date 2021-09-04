package com.haipings.order.service.service.impl;

import com.haipings.order.service.model.entity.Order;
import com.haipings.order.service.service.IOrderService;
import com.haipings.order.service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IProductService iProductService;

    @Override
    public Order selectOrderById(Integer id) {
        return new Order(id, "order-001", 1999.99,
                Collections.singletonList(iProductService.selectProductById(id)));
    }
}
