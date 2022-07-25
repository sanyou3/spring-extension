package com.sanyou.spring.extension.factorybean;

import com.sanyou.spring.extension.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/16 23:20
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        System.out.println("调用 UserFactoryBean 的 getObject 方法生成 Bean:" + user);
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}
