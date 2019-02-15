package com.criss.wang.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients({"com.criss.wang.api.**"})
@SpringBootApplication
public class FeginApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginApiApplication.class, args);
	}

}

