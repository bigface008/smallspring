package org.wzh.smallspring.test.common;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.PropertyValue;
import org.wzh.smallspring.beans.PropertyValues;
import org.wzh.smallspring.beans.factory.ConfigurableListableBeanFactory;
import org.wzh.smallspring.beans.factory.config.BeanDefinition;
import org.wzh.smallspring.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "Change to: ByteDance"));
    }
}
