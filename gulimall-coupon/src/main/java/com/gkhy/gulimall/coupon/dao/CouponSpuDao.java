package com.gkhy.gulimall.coupon.dao;

import com.gkhy.gulimall.coupon.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 13:20:52
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
