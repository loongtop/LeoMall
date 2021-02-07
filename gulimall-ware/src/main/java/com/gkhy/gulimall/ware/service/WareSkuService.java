package com.gkhy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gkhy.common.utils.PageUtils;
import com.gkhy.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 21:14:16
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

