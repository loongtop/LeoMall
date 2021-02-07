package com.gkhy.gulimall.order.dao;

import com.gkhy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 13:13:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
