package com.samina.ResetService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {
//http://localhost:8080/surveys/Survey1/questions/
/*
 * - Understand Basics of Profiles
- Setting a profile
 - Using -Dspring.profiles.active=prod in VM Arguments
 - spring.profiles.active=prod 
- Using a profile
 - application-{profile-name}.properties
 - @Profile("dev") on a bean
- Usage
 - Configure Resources - Databases, Queues, External Services
 * */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}
	@Profile("prod")
	@Bean
	public String dummy() {
		return "something";
	}

}
