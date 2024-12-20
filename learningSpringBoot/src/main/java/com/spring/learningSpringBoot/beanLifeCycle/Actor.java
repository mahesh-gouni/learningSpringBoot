package com.spring.learningSpringBoot.beanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Actor implements BeanNameAware , BeanFactoryAware,ApplicationContextAware  , InitializingBean , DisposableBean {
        private String name;

//    private String beanName;
   private ApplicationContext applicationContext;

  private BeanFactory beanFactory;






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Dance dance;
    private Fighting fighting;

    public Actor(){
        System.out.println("Instantiation: A new Actor has been created.");
        this.name="mahesh";
    }
    public void SetDance(Dance dance){
        this.dance=dance;
        System.out.println("Population of Properties: Dancing " + dance.getNatu() + " to " + getName());
    }

    public void SetFighting(Fighting fighting){

        this.fighting=fighting;
        System.out.println("Population of Properties: fighting"+fighting.getRamLaxman()+"to"+getName());

    }


    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware: Setting bean name: " + name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanFactoryAware: Setting bean factory");
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("ApplicationContextAware: Setting application context.");
        this.beanFactory=beanFactory;
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) {
//        if (bean instanceof Actor) {
//            System.out.println("BeanPostProcessor: Adding a touch of magic to " + ((Actor) bean).getName());
//        }
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) {
//        if (bean instanceof Actor) {
//            System.out.println("BeanPostProcessor: Magic continues for " + ((Actor) bean).getName());
//        }
//        return bean;
//    }
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: " + getName() + " is preparing for action.");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Initialization: " + getName() + " is undergoing intensive training.");
        trainActor();
    }

    public void customInit() {
        System.out.println("Custom Initialization: Executing custom init for " + getName());
        performSpecialTraining();
    }

    private void performSpecialTraining() {
        System.out.println("Custom Initialization: " + getName() + " is performing a special training routine.");
    }

    @PreDestroy
    public void preDestroyCleanup() {
        System.out.println("@PreDestroy: " + getName() + " is saying goodbye and preparing to rest.");
    }
    @Override
    public void destroy() {
        System.out.println("DisposableBean: " + getName() + " is saying goodbye and resting.");
        restAndRecover();

    }


    private void restAndRecover() {
        System.out.println("DisposableBean: " + getName() + " is resting and recovering energy.");
    }

    public void customDestroy() {
        System.out.println("Custom Destruction: " + getName() + " is bidding farewell and performing a final action.");
        sayGoodbye();
        performFinalAction();
    }
    private void trainActor() {
        System.out.println("Initialization: " + getName() + " is training to become stronger.");
    }


    private void sayGoodbye() {
        System.out.println("Custom Destruction: " + getName() + " says goodbye.");
    }

    private void performFinalAction() {
        System.out.println("Custom Destruction: " + getName() + " performs a final action.");
    }
}
