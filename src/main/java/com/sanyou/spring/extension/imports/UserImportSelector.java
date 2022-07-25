package com.sanyou.spring.extension.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/17 00:08
 */
public class UserImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("调用 UserImportSelector 的 selectImports 方法获取一批类限定名");
        return new String[]{"com.sanyou.spring.extension.User"};
    }

}
