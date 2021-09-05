package com.apps.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration(exclude = EmbeddedServletContainerAutoConfiguration.class)
public class PocApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}


}
