package tutorial01.example.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

//**type of the application container(IOC) is Application Context
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
//	2)	SpringApplication.run(DependencyInjectionApplication.class, args); here .run method is returning the objects of the application contex
//		Creating the JVM IOC container for the Spring Boot to handle the objects

		Dev obj = context.getBean(Dev.class);
//	3) getBean is used to get the object of Dev class
		obj.build();
	}
//	1) SpringApplication.run creates the IOC container(JVM object creation area)
}
