package com.jvm.java17testing

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@Slf4j('LOG')
class Java17TestingApplication {

	static void main(String[] args) {
		SpringApplication.run(Java17TestingApplication, args)

		AutoCloneObject obj1 = new AutoCloneObject(name: 'Roger Diller')

		AutoCloneObject obj2 = obj1.clone();

		LOG.info("obj2 name: " + obj2.name)

	}

}
