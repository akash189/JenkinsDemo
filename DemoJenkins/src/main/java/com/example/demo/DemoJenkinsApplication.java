package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);
	public static void main(String[] args) {
		logger.info("App executing");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
