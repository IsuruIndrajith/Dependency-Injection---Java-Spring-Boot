package com.tutorial01.More.about.Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MoreAboutAutowiringApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MoreAboutAutowiringApplication.class, args);
	}

}
