package com.majesty;

import org.springframework.boot.SpringApplication;

public class TestMovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MovieServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
