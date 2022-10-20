package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud_basic_first
 * BelongsPackage ==> cn.itcast.user.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-20 20:36:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@ConfigurationProperties(prefix = "pattern")
@Data
public class NacosConfigTest01 {

    private String dateformat;

    private String database;

}
