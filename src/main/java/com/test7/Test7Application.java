package com.test7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test7Application {
        String name = "mike";
	int x = 100;
	boolean isPresent = false;
	int y = 200;
	char x1 = 'a';
	double z = 10.3;
	float m = 10.3f;
	char ch = 'Z'
	public static void main(String[] args) {
		SpringApplication.run(Test7Application.class, args);
	}

}
