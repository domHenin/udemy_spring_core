package io.migenjutsu.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}


// FIXES::
// -bootstrap not being recognized: added a 'script' tag for the bootstrap webjar
// -products page getting 'whitelabel': removing the 'DemoApplication.java' file out from the springboot directory