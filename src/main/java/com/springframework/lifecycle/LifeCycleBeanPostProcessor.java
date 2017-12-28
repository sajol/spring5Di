package com.springframework.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Author: sazal
 * Date: 12/28/17
 */
@Component
public class LifeCycleBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            ((LifeCycleBean) bean).beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            ((LifeCycleBean) bean).afterInit();
        }
        return bean;
    }
}
