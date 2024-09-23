package com.se.alaf.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringMongoDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDBApplication.class, args);
	}

	/// consume a rest service
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
	
}
