package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static String msg2 = "sit-czy commit1";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private static String msg = "dev-czy commit1";

}
