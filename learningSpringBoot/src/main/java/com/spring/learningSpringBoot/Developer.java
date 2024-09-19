package com.spring.learningSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    //Laptop laptop = new Laptop();
   // @Autowired

   private Laptop laptop;


//public Developer( Laptop laptop){
//    this.laptop=laptop;
//}

    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }
    public void greet(){

        laptop.compile();
        System.out.println("hey ! bro what's up");

    }


}
