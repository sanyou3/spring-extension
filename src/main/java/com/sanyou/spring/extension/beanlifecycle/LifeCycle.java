package com.sanyou.spring.extension.beanlifecycle;

import com.sanyou.spring.extension.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/24 17:31
 */
public class LifeCycle implements InitializingBean, ApplicationContextAware, DisposableBean {

    @Autowired
    private User user;

    public LifeCycle() {
        System.out.println("LifeCycle对象被创建了");
    }

    /**
     * 实现的 Aware 回调接口
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Aware接口起作用，setApplicationContext被调用了，此时user=" + user);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct注解起作用，postConstruct方法被调用了");
    }

    /**
     * 实现 InitializingBean 接口
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean接口起作用，afterPropertiesSet方法被调用了");
    }

    /**
     * 通过 {@link Bean#initMethod()}来指定
     *
     * @throws Exception
     */
    public void initMethod() throws Exception {
        System.out.println("@Bean#initMethod()起作用，initMethod方法被调用了");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("@PreDestroy注解起作用，preDestroy方法被调用了");
    }

    /**
     * 通过 {@link Bean#destroyMethod()}来指定
     *
     * @throws Exception
     */
    public void destroyMethod() throws Exception {
        System.out.println("@Bean#destroyMethod()起作用，destroyMethod方法被调用了");
    }

    /**
     * 实现 DisposableBean 注解
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean接口起作用，destroy方法被调用了");
    }

}
