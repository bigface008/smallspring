package org.wzh.smallspring.beans.factory;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
