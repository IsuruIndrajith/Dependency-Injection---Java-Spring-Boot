package com.tutorial01.More.about.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Dev {

//    here the connection through AutoWired is done by the type "Laptop"
    @Autowired
    private Laptop laptop;


    public void build(){

    }
}