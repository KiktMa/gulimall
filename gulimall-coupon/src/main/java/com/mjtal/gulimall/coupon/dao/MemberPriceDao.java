package com.mjtal.gulimall.coupon.dao;

import com.mjtal.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:45:12
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
