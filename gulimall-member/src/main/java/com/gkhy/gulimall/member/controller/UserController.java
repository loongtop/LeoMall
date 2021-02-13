package com.gkhy.gulimall.member.controller;

import com.gkhy.common.utils.PageUtils;
import com.gkhy.common.utils.R;
import com.gkhy.gulimall.member.entity.UserEntity;
import com.gkhy.gulimall.member.feign.CouponFeignService;
import com.gkhy.gulimall.member.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 用户表
 *
 * @author leo
 * @email loongtop@gmail.com
 * @date 2021-02-06 13:36:58
 */
@RestController
@RequestMapping("member/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {

        UserEntity userEntity = new UserEntity();
        userEntity.setId(3l);
        userEntity.setLevelId(1l);
        userEntity.setUsername("Gaofei");
        userEntity.setCity("蒙特利尔");
        userEntity.setNickname("高飞-禹舜");
        userEntity.setPassword("1111111");
//        userService.save(userEntity);

        R memberCoupons = couponFeignService.memberCoupons();
        System.out.println("member/user/coupons结束。。。。。。");
        return R.ok().put("member", userEntity).put("coupons", memberCoupons.get("coupons"));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("member:user:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userService.queryPage(params);

        System.out.println("member/user/list保存结束。。。。。。");
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:user:info")
    public R info(@PathVariable("id") Long id){
		UserEntity user = userService.getById(id);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:user:save")
    public R save(@RequestBody UserEntity user){
		userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:user:update")
    public R update(@RequestBody UserEntity user){
		userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:user:delete")
    public R delete(@RequestBody Long[] ids){
		userService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
