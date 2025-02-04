package com.tutorial01.More.about.Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compile");
    }

}