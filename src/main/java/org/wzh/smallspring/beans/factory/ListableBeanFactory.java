package org.wzh.smallspring.beans.factory;

import org.wzh.smallspring.beans.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
