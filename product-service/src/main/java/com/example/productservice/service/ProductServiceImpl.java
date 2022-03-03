package com.example.productservice.service;

import com.example.productservice.model.Product;
import com.example.productservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
        private final ProductRepo productRepo;
@Autowired
        public ProductServiceImpl(ProductRepo productRepo) {
                this.productRepo = productRepo;
        }

        @Override
        public Product createProduct(Product product) {
                return productRepo.save(product);
        }
}
