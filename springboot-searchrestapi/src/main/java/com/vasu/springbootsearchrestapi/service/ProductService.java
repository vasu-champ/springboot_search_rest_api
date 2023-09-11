package com.vasu.springbootsearchrestapi.service;

import com.vasu.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
