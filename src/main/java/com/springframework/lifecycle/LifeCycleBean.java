package com.springframework.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: sazal
 * Date: 12/28/17
 */
@Component
public class LifeCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBean() {
        System.out.println("Lifecycle: Inside bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Lifecycle: Inside setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Lifecycle: Inside setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Lifecycle: Inside destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lifecycle: Inside afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Lifecycle: Inside setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Lifecycle: Inside postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Lifecycle: Inside preDestroy");
    }

    public void beforeInit() {
        System.out.println("Lifecycle: Inside beforeInit");
    }

    public void afterInit() {
        System.out.println("Lifecycle : Inside afterInit");
    }
}
