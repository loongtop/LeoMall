package com.gkhy.gulimall.product;

import com.gkhy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setRemark("leo2");
//        brandEntity.setName("华为111");
//        brandEntity.setSort(10000);
//        brandService.save(brandEntity);
//        System.out.println("保存完成.....");

//        brandEntity.setId(3l);
//        brandEntity.setName("华为555");
//        brandEntity.setId(6l);
//        brandEntity.setSort(555555);
//        brandService.save(brandEntity);
//        System.out.println("更新完成.....");

//        List<BrandEntity> idlist = brandService.list(new QueryWrapper<BrandEntity>().eq("id", 1L));
//        idlist.forEach((item)->{
//            System.out.println(item);
//        });
    }

}
