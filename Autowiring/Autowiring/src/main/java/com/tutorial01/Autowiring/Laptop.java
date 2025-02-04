package com.tutorial01.Autowiring;

import org.springframework.stereotype.Component;

//@using the @Component, this will create object in the IOC of the Laptop class
@Component
public class Laptop {
    public void compile(){
        System.out.println("Compile");
    }
}
