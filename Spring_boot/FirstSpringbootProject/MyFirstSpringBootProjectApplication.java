package com.example.MyFirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
		 String a="abhi";
		 int b = 34;
		 int c =56;
		System.out.println(c*b+23);
		System.out.println(a);
	}

}
