package com.haipings.order.service.fallback;

import com.haipings.order.service.model.entity.Product;
import com.haipings.order.service.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<IProductService> {

    Logger logger = LoggerFactory.getLogger(ProductServiceFallbackFactory.class);

    @Override
    public IProductService create(Throwable cause) {
        return new IProductService() {
            @Override
            public Product selectProductById(Integer id) {
                logger.error("--- product-service 服务 selectProductById 方法出现异常，异常信息如下：" + cause);
                return new Product(id, "托底数据", 0D);
            }
        };
    }
}
