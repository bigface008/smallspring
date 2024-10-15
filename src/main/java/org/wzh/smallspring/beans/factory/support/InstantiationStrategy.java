package org.wzh.smallspring.beans.factory.support;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition definition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
