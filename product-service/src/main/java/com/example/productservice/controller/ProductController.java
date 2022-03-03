package com.example.productservice.controller;

import java.math.BigDecimal;

import com.example.productservice.model.Product;
import com.example.productservice.proxy.Coupon;
import com.example.productservice.proxy.CouponProxy;
import com.example.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {

    private final ProductService productService;
    private final CouponProxy couponProxy;
    public ProductController(ProductService productService,CouponProxy couponProxy) {
        this.productService = productService;
        this.couponProxy=couponProxy;
    }
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product)
    {
        Coupon coupon=couponProxy.getCouponByCode(product.getCouponCode());
        BigDecimal price=product.getPrice().subtract(coupon.getDiscount());
        product.setPrice(price);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }


}
