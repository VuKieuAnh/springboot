package com.codegym.springbootr.service;

import com.codegym.springbootr.model.Product;

public interface ProductService {
    Iterable<Product> findAll();
    Product findByOne(Long id);
    void save (Product product);
    void delete(Product product);
}
