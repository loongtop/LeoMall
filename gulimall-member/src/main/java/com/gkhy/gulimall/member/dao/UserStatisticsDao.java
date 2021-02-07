package com.gkhy.gulimall.member.dao;

import com.gkhy.gulimall.member.entity.UserStatisticsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 统计信息表
 * 
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 13:36:58
 */
@Mapper
public interface UserStatisticsDao extends BaseMapper<UserStatisticsEntity> {
	
}
