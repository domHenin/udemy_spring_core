package io.migenjutsu.helloworld3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplicationSect3 {

    public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplicationSect3.class, args);

		InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
		constructorService.getMessage();

		SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
		setterBasedService.getMessage();
	}
}


// ApplicationContext ctx = SpringApplication.run(DemoApplicationSect3.class, args);
// InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");

// constructorService.getMessage();

// SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
// setterBasedService.getMessage();