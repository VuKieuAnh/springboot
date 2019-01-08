package com.codegym.springbootr.service;

import com.codegym.springbootr.model.Product;
import com.codegym.springbootr.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceIplm implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findByOne(Long id) {
        return null;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
