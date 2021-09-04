package com.haipings.order.service.service;

import com.haipings.order.service.fallback.ProductServiceFallbackFactory;
import com.haipings.order.service.model.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "product-service", fallbackFactory = ProductServiceFallbackFactory.class)
public interface IProductService {

    @GetMapping("/product/{id}")
    Product selectProductById(@PathVariable("id") Integer id);
}
