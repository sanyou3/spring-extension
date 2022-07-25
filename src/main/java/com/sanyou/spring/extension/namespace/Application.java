package com.sanyou.spring.extension.namespace;

import com.sanyou.spring.extension.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/16 22:45
 */
public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);

        System.out.println(user);

    }

}
