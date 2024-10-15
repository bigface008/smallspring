package org.wzh.smallspring.beans.factory.support;

import org.wzh.smallspring.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
