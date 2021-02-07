package com.gkhy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gkhy.common.utils.PageUtils;
import com.gkhy.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 11:00:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

