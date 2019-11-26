package io.migenjutsu.dependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public interface HelloWorldService {
    public String getGreeting();
}

// public String getGreeting();