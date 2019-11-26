package io.migenjutsu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.migenjutsu.dependencyinjection.services.HelloWorldService;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceEnglishImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {
    
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglishImpl() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanishImpl() {
        return new HelloWorldServiceSpanishImpl();
    }
}