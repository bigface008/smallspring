package org.wzh.smallspring.beans.factory;

public interface DisposableBean {
    void destroy() throws Exception;
}
