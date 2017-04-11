package com.german.cube.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CubeApp {

	@Bean
	public CubeService createCubeServiceBean(){
		return new CubeService();
	}

	@Bean
	public HelperCube createHelperCubeBean(){
		return new HelperCube();
	}

	public static void main(String[] args) {
		SpringApplication.run(CubeApp.class, args);
	}
}
