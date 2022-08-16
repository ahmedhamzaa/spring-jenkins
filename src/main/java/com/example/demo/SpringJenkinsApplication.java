package com.example.demo;


import org.slf4j.Logger;
import  org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	public void test() {
		logger.info("My app started");
	}
	public static void main(String[] args) {
		logger.info("My app excuted");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
