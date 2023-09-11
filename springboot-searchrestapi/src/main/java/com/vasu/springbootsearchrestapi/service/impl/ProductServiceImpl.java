package com.vasu.springbootsearchrestapi.service.impl;

import com.vasu.springbootsearchrestapi.entity.Product;
import com.vasu.springbootsearchrestapi.repository.ProductRepository;
import com.vasu.springbootsearchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
