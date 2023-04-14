package com.jvm.java17testing

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import java.util.Properties;

@SpringBootApplication
class Java17TestingApplication {

	static void main(String[] args) {
		SpringApplication.run(Java17TestingApplication.class, args);

		AutoCloneObject obj1 = new AutoCloneObject();
		obj1.setName("Roger Diller");

		AutoCloneObject obj2 = obj1.clone();

		System.out.println("obj2 name: " + obj2.getName());

	}

}
