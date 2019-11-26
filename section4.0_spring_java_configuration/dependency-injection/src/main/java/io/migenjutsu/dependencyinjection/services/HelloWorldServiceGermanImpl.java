package io.migenjutsu.dependencyinjection.services;

public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hallo Welt";
    }
}