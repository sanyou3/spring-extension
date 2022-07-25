package com.sanyou.spring.extension;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

/**
 * 微信公众号：三友的java日记
 *
 * @author snayou
 * @date 2022/7/16 21:53
 */
@Getter
@Setter
@Accessors(chain = true)
public class User {

    @Value("${sanyou.username:}")
    private String username;

}
