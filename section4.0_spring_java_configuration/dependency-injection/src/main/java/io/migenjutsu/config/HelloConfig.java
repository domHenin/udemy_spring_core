package io.migenjutsu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import io.migenjutsu.dependencyinjection.services.HelloWorldFactory;
import io.migenjutsu.dependencyinjection.services.HelloWorldService;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceEnglishImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceFrenchImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceGermanImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServicePolishImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceRussianImpl;
import io.migenjutsu.dependencyinjection.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory HelloWorldFactory() {
        return new HelloWorldFactory();
    }
    
    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ru");
    }
}