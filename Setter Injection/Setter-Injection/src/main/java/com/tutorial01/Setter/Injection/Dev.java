package com.tutorial01.Setter.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    private Laptop laptop;

//    for the setter injection we have to import Autowired
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public void build(){
laptop.compile();
    }
}
