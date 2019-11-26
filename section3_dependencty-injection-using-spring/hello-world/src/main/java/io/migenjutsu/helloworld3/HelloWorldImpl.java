package io.migenjutsu.helloworld3;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {
    public void sayHello() {
        System.out.println("Hello World");
    }
}


// public void sayHello() {
//     System.out.println("Hello World!");
// }