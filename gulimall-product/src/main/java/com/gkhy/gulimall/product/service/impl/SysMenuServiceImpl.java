package com.gkhy.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gkhy.common.utils.PageUtils;
import com.gkhy.common.utils.Query;
import com.gkhy.gulimall.product.dao.SysMenuDao;
import com.gkhy.gulimall.product.entity.SysMenuEntity;
import com.gkhy.gulimall.product.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysMenuEntity> page = this.page(
                new Query<SysMenuEntity>().getPage(params),
                new QueryWrapper<SysMenuEntity>()
        );

        return new PageUtils(page);
    }

}