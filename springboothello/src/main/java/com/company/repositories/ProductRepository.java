package com.company.repositories;
import org.springframework.data.repository.CrudRepository;

import com.compay.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Product findOne(String id);

    @Override
    void delete(Product deleted);
}