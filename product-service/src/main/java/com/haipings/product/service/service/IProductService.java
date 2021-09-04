package com.haipings.product.service.service;

import com.haipings.product.service.model.entity.Product;

public interface IProductService {

    /**
     * 根据主键查询商品
     * @param id 主键id
     * @return Product
     */
    Product selectProductById(Integer id);
}
