package com.example.apispringtad;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//teste

@EnableRabbit
@SpringBootApplication
public class ApiSpringTadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringTadApplication.class, args);
	}

}
