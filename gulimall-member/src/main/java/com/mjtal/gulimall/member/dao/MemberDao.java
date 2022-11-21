package com.mjtal.gulimall.member.dao;

import com.mjtal.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 23:05:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
