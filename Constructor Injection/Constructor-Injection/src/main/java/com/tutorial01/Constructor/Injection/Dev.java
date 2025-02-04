package com.tutorial01.Constructor.Injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Dev {

    private Laptop laptop;
//    passing the instance of laptop inside the constructor
//    this is called as constructor injection

    public Dev(Laptop laptop){
        this.laptop = laptop;
    }
    public void build(){
        laptop.compile();
        System.out.println("Building project");
    }
}
