package com.example.productservice.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("COUPON-SERVICE-WS")
public interface CouponProxy {
    @GetMapping("/coupons/{code}")
    public Coupon getCouponByCode(@PathVariable("code") String code);
}
