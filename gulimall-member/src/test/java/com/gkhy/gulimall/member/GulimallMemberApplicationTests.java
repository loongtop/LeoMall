package com.gkhy.gulimall.member;

import com.gkhy.gulimall.member.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {

//        UserEntity userEntity = new UserEntity();
//        userEntity.setId(3l);
//        userEntity.setCity("蒙特利尔");
//        userEntity.setNickname("高飞");
//        userService.save(userEntity);
//
//        System.out.println("保存结束。。。。。。");
    }

}
