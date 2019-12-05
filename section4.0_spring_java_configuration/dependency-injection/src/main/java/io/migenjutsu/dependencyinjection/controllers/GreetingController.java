package io.migenjutsu.dependencyinjection.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import io.migenjutsu.dependencyinjection.services.HelloWorldService;
// import io.migenjutsu.dependencyinjection.services.HelloWorldServiceGermanImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceEnglishImpl;

@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    
    private HelloWorldService helloWorldServiceGerman;

    private HelloWorldService helloWorldServiceFrench;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("german")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }


    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }
}

    // private HelloWorldService helloWorldService;
    
    // private HelloWorldService helloWorldServiceGerman;

    // private HelloWorldService helloWorldServiceFrench;

    // @Autowired
    // public void setHelloWorldService(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // }

    // @Autowired
    // @Qualifier("german")
    // public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
    //     this.helloWorldServiceGerman = helloWorldServiceGerman;
    // }

    // @Autowired
    // @Qualifier("french")
    // public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
    //     this.helloWorldServiceFrench = helloWorldServiceFrench;
    // }


    // public String sayHello() {
    //     String greeting = helloWorldService.getGreeting();

    //     System.out.println(greeting);
    //     System.out.println(helloWorldServiceGerman.getGreeting());
    //     System.out.println(helloWorldServiceFrench.getGreeting());
    //     return greeting;
    // }



