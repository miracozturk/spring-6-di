package mozt.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hi I am in MyControllers cllass sayHello Method");
        return "Hello from MyController sayHello method";
    }

}
