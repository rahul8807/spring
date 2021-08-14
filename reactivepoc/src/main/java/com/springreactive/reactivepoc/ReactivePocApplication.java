package com.springreactive.reactivepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class ReactivePocApplication {

	@Bean
	RouterFunction<ServerResponse> helloWorld(GreetingService greetingService){
		return route();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReactivePocApplication.class, args);
	}

}


class GreetingService{

}