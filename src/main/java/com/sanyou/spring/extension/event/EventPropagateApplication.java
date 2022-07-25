package com.sanyou.spring.extension.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/24 12:32
 */
public class EventPropagateApplication {

    public static void main(String[] args) {

        // 创建一个父容器
        AnnotationConfigApplicationContext parentApplicationContext = new AnnotationConfigApplicationContext();
        //将 打119监听器 注册到父容器中
        parentApplicationContext.register(Call119FireEventListener.class);
        parentApplicationContext.refresh();

        // 创建一个子容器
        AnnotationConfigApplicationContext childApplicationContext = new AnnotationConfigApplicationContext();
        //将 救人监听器 注册到子容器中
        childApplicationContext.register(SavePersonFireEventListener.class);
        childApplicationContext.refresh();

        // 设置一下父容器
        childApplicationContext.setParent(parentApplicationContext);

        // 通过子容器发布着火的事件，触发监听
        childApplicationContext.publishEvent(new FireEvent("着火了"));

    }

}
