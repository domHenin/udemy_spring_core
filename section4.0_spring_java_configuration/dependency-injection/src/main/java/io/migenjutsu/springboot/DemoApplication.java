// package io.migenjutsu.dependencyinjection.springboot;
// package io.migenjutsu.springboot;
package io.migenjutsu.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import io.migenjutsu.dependencyinjection.controllers.GreetingController;

@SpringBootApplication
@ComponentScan("io.migenjutsu.dependencyinjection")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}	
}


// ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

// GreetingController controller = (GreetingController) ctx.getBean("greetingController");
// controller.sayHello();