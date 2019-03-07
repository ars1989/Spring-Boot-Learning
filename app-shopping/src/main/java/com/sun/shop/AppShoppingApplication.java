package com.sun.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.sun.shop")
public class AppShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppShoppingApplication.class, args);
	}
}
