package io.migenjutsu.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hallo Welt";
    }
}

// @Override
// public String getGreeting() {
//     return "Hallo Welt";
// }