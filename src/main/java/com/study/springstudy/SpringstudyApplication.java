package com.study.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstudyApplication {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.io.tmpdir"));
		SpringApplication.run(SpringstudyApplication.class, args);
	}

}
