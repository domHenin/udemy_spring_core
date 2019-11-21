package io.migenjutsu.helloworld2;

import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService=helloWorldService;
    }
}