package cn.itcast.order.feignconfig;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud_basic_first
 * BelongsPackage ==> cn.itcast.order.feignconfig
 * Version ==> 1.0
 * CreateTime ==> 2022-10-22 09:51:19
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Long id);


}
