package com.HospitalManagementSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class HospitalManagementSystemApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("Inside HospitalManagementSystemApplication Main Method");
		SpringApplication.run(HospitalManagementSystemApplication.class, args);
	}

}
