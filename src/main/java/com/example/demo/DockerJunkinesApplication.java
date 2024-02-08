package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJunkinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJunkinesApplication.class, args);
	   System.out.println("la carre de number 10 est =" +Operation.square(10));
	   System.out.println("l'oppose de number de 20 est="+ Operation.opposite(20));
	}

}
