package org.wzh.smallspring.beans.factory.config;

import org.wzh.smallspring.beans.PropertyValue;
import org.wzh.smallspring.beans.PropertyValues;

public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class bean) {
        this.beanClass = bean;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class bean, PropertyValues propertyValues) {
        this.beanClass = bean;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
