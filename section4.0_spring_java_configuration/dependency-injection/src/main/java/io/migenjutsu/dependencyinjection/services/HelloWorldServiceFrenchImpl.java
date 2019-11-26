package io.migenjutsu.dependencyinjection.services;

public class HelloWorldServiceFrenchImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Bonjour le monde";
    }
}