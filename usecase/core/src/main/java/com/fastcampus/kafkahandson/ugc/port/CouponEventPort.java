package com.fastcampus.kafkahandson.ugc.port;

import com.fastcampus.kafkahandson.ugc.coupon.CouponEvent;

public interface CouponEventPort {
    CouponEvent findById(Long id);
}
