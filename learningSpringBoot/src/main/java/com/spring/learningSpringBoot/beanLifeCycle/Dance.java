package com.spring.learningSpringBoot.beanLifeCycle;

public class Dance {
     //private

  private   String natu;

    public String getNatu() {
        return natu;
    }
    public Dance(String natu){
        this.natu=natu;
    }

    public void setNatu(String natu) {
        this.natu = natu;
    }
}
