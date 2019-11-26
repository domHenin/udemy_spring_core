package io.migenjutsu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.migenjutsu.dependencyinjection.services.HelloWorldFactory;
import io.migenjutsu.dependencyinjection.services.HelloWorldService;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceEnglishImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory HelloWorldFactory() {
        return new HelloWorldFactory();
    }
    
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return new HelloWorldServiceSpanishImpl();
    }
}