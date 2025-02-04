package com.tutorial01.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    created the reference(an instance variable) of the class not the object

    //    connecting the Laptop class using @Autowired. @Autowired on the top is called field injection
    @Autowired
    private Laptop laptop;

    public void build(){
        System.out.println("Building project");
    }
}
