package org.wzh.smallspring.beans.factory;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.factory.config.AutowireCapableBeanFactory;
import org.wzh.smallspring.beans.factory.config.BeanDefinition;
import org.wzh.smallspring.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}
