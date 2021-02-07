package com.gkhy.gulimall.product.dao;

import com.gkhy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 11:00:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
