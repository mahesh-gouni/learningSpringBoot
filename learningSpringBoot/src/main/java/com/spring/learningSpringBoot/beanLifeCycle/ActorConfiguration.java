package com.spring.learningSpringBoot.beanLifeCycle;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActorConfiguration {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public Actor actor(){
        Actor actor = new Actor();

        actor.SetDance(dance());
        actor.SetFighting(fighting());

        return actor;
    }

    @Bean
    public Dance dance(){
        return new Dance("slasa");
    }

    @Bean
    public Fighting fighting(){

        return new Fighting("dhabidi");
    }

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new BeanPostProcessor();
    }



}
