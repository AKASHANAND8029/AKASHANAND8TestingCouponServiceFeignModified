package com.example.couponservice1.service;

import java.util.List;

import com.example.couponservice1.model.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.couponservice1.model.model.Coupon;
@Service
public class CouponServiceImpl implements CouponService {

    private final CouponRepo couponRepo;


    @Autowired
    public CouponServiceImpl(CouponRepo couponRepo) {
        this.couponRepo = couponRepo;
    }


    @Override
    public List<Coupon> getAllCoupons() {
        // TODO Auto-generated method stub
        return couponRepo.findAll();
    }


    @Override
    public Coupon getCouponByCode(String code) {
        // TODO Auto-generated method stub
        return couponRepo.findByCode(code);
    }

}
