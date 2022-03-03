package com.example.couponservice1.service;

import com.example.couponservice1.model.model.Coupon;

import java.util.List;



public interface CouponService {

    public List<Coupon> getAllCoupons();
    public Coupon getCouponByCode(String code);

}
