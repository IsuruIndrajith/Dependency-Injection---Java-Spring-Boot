package com.tutorial01.Constructor.Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ConstructorInjectionApplication.class, args);
	}

}
