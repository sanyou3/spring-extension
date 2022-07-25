package com.sanyou.spring.extension.beanlifecycle;

import com.sanyou.spring.extension.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/24 17:37
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 LifeCycle 注册到容器中
        applicationContext.register(Application.class);
        applicationContext.refresh();

        // 关闭上下文，触发销毁操作
        applicationContext.close();
    }


    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifeCycle lifeCycle() {
        return new LifeCycle();
    }

    @Bean
    public User user() {
        return new User();
    }

}
