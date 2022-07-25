package com.sanyou.spring.extension.factorybean;

import com.sanyou.spring.extension.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/16 23:21
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 UserFactoryBean 注册到容器中
        applicationContext.register(UserFactoryBean.class);
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);
        System.out.println("获取到的Bean为" + user + "，属性username值为：" + user.getUsername());
    }

}
