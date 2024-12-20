package com.spring.learningSpringBoot.beanLifeCycle;

public class Fighting {
    private String ramLaxman ;


     public String getRamLaxman() {
          return ramLaxman;
     }

     public void setRamLaxman(String ramLaxman) {
          this.ramLaxman = ramLaxman;
     }
     public Fighting(String ramLaxman){
         this.ramLaxman=ramLaxman;

     }
}
