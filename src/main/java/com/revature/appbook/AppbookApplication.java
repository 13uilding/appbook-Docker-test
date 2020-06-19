package com.revature.appbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppbookApplication.class, args);
	}

}
