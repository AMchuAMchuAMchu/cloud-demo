package cn.itcast.user.web;

import cn.itcast.user.config.NacosConfigTest01;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    @Autowired
    private NacosConfigTest01 nacosConfigTest01;

    @GetMapping("/now")
    public String get(){
        System.out.println(" >>> ");
        System.out.println(" >>> ");
        System.out.println(" >>> ");
//        return DateTimeFormatter.ofPattern(dateformat).format(LocalDateTime.now());
//        return DateTimeFormatter.ofPattern(nacosConfigTest01.getDateformat()).format(LocalDateTime.now());
        return DateTimeFormatter.ofPattern(nacosConfigTest01.getDateformat()!=null?nacosConfigTest01.getDateformat():"yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now())
                +"||"+nacosConfigTest01.getDatabase();
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id,
                          @RequestHeader(value = "Truth",required = false) String truth) {
        System.out.println(">>>"+truth);
        return userService.queryById(id);
    }
}
