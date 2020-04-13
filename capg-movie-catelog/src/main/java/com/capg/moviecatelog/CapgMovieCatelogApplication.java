package com.capg.moviecatelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CapgMovieCatelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapgMovieCatelogApplication.class, args);
	}

}
