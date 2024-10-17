package org.wzh.smallspring.beans.factory.config;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
