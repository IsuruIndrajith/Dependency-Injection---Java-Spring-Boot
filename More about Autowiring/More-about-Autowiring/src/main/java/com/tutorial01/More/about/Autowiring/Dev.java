package com.tutorial01.More.about.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dev {

//    here the connection through AutoWired is done by the type "Laptop"
    @Autowired
//    here to select the bean from various beans of same interface including the bean name inside the Qualifier
//    use this qualifier or the @primary annotation
    @Qualifier("laptop")
    private Computer comp;


    public void build(){
    comp.compile();
    System.out.println("Building project");
    }
}