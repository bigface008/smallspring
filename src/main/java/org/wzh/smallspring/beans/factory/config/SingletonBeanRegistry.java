package org.wzh.smallspring.beans.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void destroySingletons();
}
