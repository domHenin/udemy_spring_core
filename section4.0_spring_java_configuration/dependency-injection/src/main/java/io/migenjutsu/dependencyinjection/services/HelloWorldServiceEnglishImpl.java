package io.migenjutsu.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}