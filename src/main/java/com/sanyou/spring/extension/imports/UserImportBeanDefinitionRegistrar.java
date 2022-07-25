package com.sanyou.spring.extension.imports;

import com.sanyou.spring.extension.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 00:25
 */
public class UserImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        //构建一个 BeanDefinition , Bean的类型为 User
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class)
                // 设置 User 这个Bean的属性username的值为我是三友
                .addPropertyValue("username", "三友的java日记")
                .getBeanDefinition();

        System.out.println("往Spring容器中注入User");
        //把 User 这个Bean的定义注册到容器中
        registry.registerBeanDefinition("user", beanDefinition);
    }

}
