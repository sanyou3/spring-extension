package com.sanyou.spring.extension.beanpostprocessor;

import com.sanyou.spring.extension.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 14:14
 */
@Component
public class UserBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            //如果当前的Bean的类型是 User ，就把这个对象 username 的属性赋值为 三友的java日记
            ((User) bean).setUsername("三友的java日记");
        }

        return bean;
    }

}
