package hit.springframework.controllers;

import hit.springframework.services.GreetingService;
import hit.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    //public GreetingServiceImpl greetingService;
    public GreetingService greetingServiceImpl;

    public String sayHello() {
       return greetingServiceImpl.sayGreeting();
    }

    /*public GreetingServiceImpl getGreetingService(){
        return greetingService;}*/
}
