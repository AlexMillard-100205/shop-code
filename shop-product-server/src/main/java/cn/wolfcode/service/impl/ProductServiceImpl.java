package cn.wolfcode.service.impl;

import cn.wolfcode.dao.ProductDao;
import cn.wolfcode.domain.Product;
import cn.wolfcode.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    public ProductDao productDao;

    @Override
    public Product findById(Long pid) {
        return productDao.findById(pid).get();
    }
}
