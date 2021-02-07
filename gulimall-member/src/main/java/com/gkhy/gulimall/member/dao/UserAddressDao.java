package com.gkhy.gulimall.member.dao;

import com.gkhy.gulimall.member.entity.UserAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 收货地址表
 * 
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 13:36:58
 */
@Mapper
public interface UserAddressDao extends BaseMapper<UserAddressEntity> {
	
}
