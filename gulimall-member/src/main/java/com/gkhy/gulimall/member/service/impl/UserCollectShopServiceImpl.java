package com.gkhy.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gkhy.common.utils.PageUtils;
import com.gkhy.common.utils.Query;

import com.gkhy.gulimall.member.dao.UserCollectShopDao;
import com.gkhy.gulimall.member.entity.UserCollectShopEntity;
import com.gkhy.gulimall.member.service.UserCollectShopService;


@Service("userCollectShopService")
public class UserCollectShopServiceImpl extends ServiceImpl<UserCollectShopDao, UserCollectShopEntity> implements UserCollectShopService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserCollectShopEntity> page = this.page(
                new Query<UserCollectShopEntity>().getPage(params),
                new QueryWrapper<UserCollectShopEntity>()
        );

        return new PageUtils(page);
    }

}