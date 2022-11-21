package com.mjtal.gulimall.member.feign;

import com.mjtal.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "gulimall-coupon",url = "http://localhost:9000/")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R feignMember();
}
