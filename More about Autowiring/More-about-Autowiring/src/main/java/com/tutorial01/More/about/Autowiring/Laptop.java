package com.tutorial01.More.about.Autowiring;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//During the Autowiring of the interface Computer there are 2 beans found for Desktop and Laptop
//to select the Laptop as the primary bean @Primary has been used.
public class Laptop implements Computer {
//    Laptop is a type of computer

    public void compile(){
        System.out.println("Compile");
    }

}