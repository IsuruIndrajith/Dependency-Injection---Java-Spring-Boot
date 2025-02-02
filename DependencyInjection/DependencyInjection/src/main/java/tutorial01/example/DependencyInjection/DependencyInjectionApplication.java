package tutorial01.example.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(DependencyInjectionApplication.class, args);
	}
//	SpringApplication.run creates the IOC container(JVM object creation area)
}
