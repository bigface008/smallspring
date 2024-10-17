package org.wzh.smallspring.context;

import org.wzh.smallspring.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
