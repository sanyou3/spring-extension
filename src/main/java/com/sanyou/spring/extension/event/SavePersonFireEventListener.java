package com.sanyou.spring.extension.event;

import org.springframework.context.ApplicationListener;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/18 11:20
 */
public class SavePersonFireEventListener implements ApplicationListener<FireEvent> {

    @Override
    public void onApplicationEvent(FireEvent event) {
        System.out.println("救人");
    }

}
