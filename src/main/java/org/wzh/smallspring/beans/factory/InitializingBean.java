package org.wzh.smallspring.beans.factory;

public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
