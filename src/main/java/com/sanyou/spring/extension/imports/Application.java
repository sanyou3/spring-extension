package com.sanyou.spring.extension.imports;

import com.sanyou.spring.extension.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 00:10
 */
@Import(UserImportBeanDefinitionRegistrar.class)
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 Application 注册到容器中
        applicationContext.register(Application.class);
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);
        System.out.println("获取到的Bean为" + user + "，属性username值为：" + user.getUsername());
    }

}
