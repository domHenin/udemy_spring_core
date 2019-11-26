package io.migenjutsu.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
}

// @Component
// @Profile("spanish")
// @Override
// public String getGreeting() {
//     return "Hola Mundo";
// }