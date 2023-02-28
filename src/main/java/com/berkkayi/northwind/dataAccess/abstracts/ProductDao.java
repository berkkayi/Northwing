package com.berkkayi.northwind.dataAccess.abstracts;

import com.berkkayi.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
