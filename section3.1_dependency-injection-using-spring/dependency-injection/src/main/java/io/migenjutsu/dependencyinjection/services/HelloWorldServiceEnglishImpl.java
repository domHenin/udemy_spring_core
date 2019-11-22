package io.migenjutsu.dependencyinjection.services;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    private HelloWorldService helloWorldService;
}