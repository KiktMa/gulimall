package com.mjtal.common.product.dao;

import com.mjtal.common.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
