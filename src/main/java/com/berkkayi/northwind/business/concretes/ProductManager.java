package com.berkkayi.northwind.business.concretes;

import com.berkkayi.northwind.business.abstracts.ProductService;
import com.berkkayi.northwind.dataAccess.abstracts.ProductDao;
import com.berkkayi.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
