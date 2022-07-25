package com.sanyou.spring.extension.event;

import org.springframework.context.ApplicationEvent;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/18 11:18
 */
public class FireEvent extends ApplicationEvent {

    public FireEvent(String source) {
        super(source);
    }

}
