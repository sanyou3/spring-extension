package com.sanyou.spring.extension.beanfactorypostprocessor;

import com.sanyou.spring.extension.User;
import com.sanyou.spring.extension.beanpostprocessor.UserBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 18:08
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 MyBeanFactoryPostProcessor 注册到容器中
        applicationContext.register(MyBeanFactoryPostProcessor.class);
        applicationContext.refresh();
    }

}
