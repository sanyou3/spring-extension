package com.sanyou.spring.extension.springbootextension;

import com.sanyou.spring.extension.factorybean.UserFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 19:20
 */
@Configuration
public class UserAutoConfiguration {

    @Bean
    public UserFactoryBean userFactoryBean() {
        return new UserFactoryBean();
    }

}
