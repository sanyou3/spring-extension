package com.sanyou.spring.extension.springbootextension.autoconfiguration;

import com.sanyou.spring.extension.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 19:28
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class);

        User user = applicationContext.getBean(User.class);

        System.out.println("获取到的Bean为" + user);
    }

}
