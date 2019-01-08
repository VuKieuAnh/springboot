package com.codegym.springbootr.repository;

import com.codegym.springbootr.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
