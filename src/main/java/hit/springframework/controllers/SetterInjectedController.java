package hit.springframework.controllers;

import hit.springframework.services.GreetingService;
import hit.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    //Injector at method level is either on method level or inside the method level.
    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
