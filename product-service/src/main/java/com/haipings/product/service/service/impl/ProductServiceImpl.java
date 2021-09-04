package com.haipings.product.service.service.impl;

import com.haipings.product.service.model.entity.Product;
import com.haipings.product.service.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public Product selectProductById(Integer id) {
        return new Product(id, "编程思想", 59.99);
    }
}
