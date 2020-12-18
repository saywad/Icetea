package com.example.Icetea;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.**.dao")
public class IceteaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceteaApplication.class, args);
	}

}
