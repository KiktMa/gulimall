package com.mjtal.common.product.dao;

import com.mjtal.common.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:10
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
