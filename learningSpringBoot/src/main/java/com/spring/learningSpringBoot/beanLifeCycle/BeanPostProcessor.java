package com.spring.learningSpringBoot.beanLifeCycle;

public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {



    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Actor) {
            System.out.println("BeanPostProcessor: Adding a touch of magic to " + ((Actor) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Actor) {
            System.out.println("BeanPostProcessor: Magic continues for " + ((Actor) bean).getName());
        }
        return bean;
    }
}
