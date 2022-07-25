package com.sanyou.spring.extension.event;

import com.sanyou.spring.extension.beanfactorypostprocessor.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/18 12:22
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 事件监听器 注册到容器中
        applicationContext.register(Call119FireEventListener.class);
        applicationContext.register(SavePersonFireEventListener.class);
        applicationContext.refresh();

        // 发布着火的事件，触发监听
        applicationContext.publishEvent(new FireEvent("着火了"));
    }

}
