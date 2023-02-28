package com.berkkayi.northwind.business.abstracts;

import com.berkkayi.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
