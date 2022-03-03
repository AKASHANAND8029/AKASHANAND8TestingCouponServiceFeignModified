package com.example.couponservice1.model.repos;

import com.example.couponservice1.model.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {

    @Query
    public Coupon findByCode(String code);

}
