package tutorial01.example.DependencyInjection;

import org.springframework.stereotype.Component;

//by @Component spring will know the classes that it must manage.
//That means spring will create the object in the IOC container for this class
@Component
public class Dev  {

    public void build(){
        System.out.println("Building Spring Boot project");
    }
}
