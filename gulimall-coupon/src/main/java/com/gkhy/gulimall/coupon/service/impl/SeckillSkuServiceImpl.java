package com.gkhy.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gkhy.common.utils.PageUtils;
import com.gkhy.common.utils.Query;

import com.gkhy.gulimall.coupon.dao.SeckillSkuDao;
import com.gkhy.gulimall.coupon.entity.SeckillSkuEntity;
import com.gkhy.gulimall.coupon.service.SeckillSkuService;


@Service("seckillSkuService")
public class SeckillSkuServiceImpl extends ServiceImpl<SeckillSkuDao, SeckillSkuEntity> implements SeckillSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuEntity> page = this.page(
                new Query<SeckillSkuEntity>().getPage(params),
                new QueryWrapper<SeckillSkuEntity>()
        );

        return new PageUtils(page);
    }

}