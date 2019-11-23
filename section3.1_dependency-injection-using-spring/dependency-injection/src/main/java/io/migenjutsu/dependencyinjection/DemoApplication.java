package io.migenjutsu.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.migenjutsu.dependencyinjection.controllers.GreetingController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}

}
