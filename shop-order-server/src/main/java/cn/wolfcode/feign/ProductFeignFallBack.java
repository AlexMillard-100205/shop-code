package cn.wolfcode.feign;

import cn.wolfcode.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignFallBack implements ProductFeignApi{


    @Override
    public Product findByPid(Long pid) {
        Product product = new Product();
        product.setPid(-1L);
        product.setName("默认数据");
        product.setProductPrice(0.0);
        return product;
    }
}
