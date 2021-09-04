package com.haipings.order.service.service;

import com.haipings.order.service.model.entity.Order;

public interface IOrderService {

    /**
     * 根据主键查询订单信息
     * @param id 主键id
     * @return Order
     */
    Order selectOrderById(Integer id);
}
