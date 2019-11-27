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
    public HelloWorldFactory helloWorldFactory() {
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
    @Primary
    public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean(name="french")
    public HelloWorldService helloWorldServiceFrenchImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean(name = "german")
    public HelloWorldService helloWorldServiceGermanImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolishImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussianImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("ru");
    }
}

    // @Bean
    // public HelloWorldFactory HelloWorldFactory() {
    //     return new HelloWorldFactory();
    // }

    // @Bean
    // @Profile("english")
    // @Primary
    // public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("en");
    // }

    // @Bean
    // @Profile("spanish")
    // @Primary
    // public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("es");
    // }

    // @Bean(name = "french")
    // public HelloWorldService helloWorldServiceFrenchImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("fr");
    // }

    // @Bean(name = "german")
    // public HelloWorldService helloWorldServiceGermanImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("de");
    // }

    // @Bean
    // public HelloWorldService helloWorldServicePolishImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("pl");
    // }

    // @Bean
    // public HelloWorldService helloWorldServiceRussinanImpl(HelloWorldFactory factory) {
    //     return factory.createHelloWorldService("ru");
    // }

