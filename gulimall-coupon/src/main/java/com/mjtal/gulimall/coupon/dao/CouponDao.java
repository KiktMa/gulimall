package com.mjtal.gulimall.coupon.dao;

import com.mjtal.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:45:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
