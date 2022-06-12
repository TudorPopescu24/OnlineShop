package com.example.onlineshop.service;

import com.example.onlineshop.model.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
