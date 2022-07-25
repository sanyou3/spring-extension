package com.sanyou.spring.extension.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 18:35
 */
@Component
public class Application {

    public static void main(String[] args) {
        List<String> classNames = SpringFactoriesLoader.loadFactoryNames(MyEnableAutoConfiguration.class, MyEnableAutoConfiguration.class.getClassLoader());
        classNames.forEach(System.out::println);
    }

}
