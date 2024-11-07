package com.rocketcode.Prueba8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.rocketcode.Prueba8.mapper")
@SpringBootApplication
public class Prueba8Application {

	public static void main(String[] args) {
		SpringApplication.run(Prueba8Application.class, args);
	}

}
