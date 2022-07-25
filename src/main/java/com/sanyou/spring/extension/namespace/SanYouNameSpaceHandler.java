package com.sanyou.spring.extension.namespace;

import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.w3c.dom.Element;

/**
 * 微信公众号：三友的java日记
 *
 * @author sanyou
 * @date 2022/7/16 22:34
 */
public class SanYouNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("mybean", new SanYouBeanDefinitionParser());
    }

    private static class SanYouBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

        @Override
        protected boolean shouldGenerateId() {
            return true;
        }

        @Override
        protected String getBeanClassName(Element element) {
            return element.getAttribute("class");
        }

    }

}
