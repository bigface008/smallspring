package org.wzh.smallspring.test.common;

import org.wzh.smallspring.beans.BeansException;
import org.wzh.smallspring.beans.factory.config.BeanPostProcessor;
import org.wzh.smallspring.test.bean.UserService;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("userService")) {
            UserService userService = (UserService) bean;
            userService.setLocation("Change to: Beijing");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
