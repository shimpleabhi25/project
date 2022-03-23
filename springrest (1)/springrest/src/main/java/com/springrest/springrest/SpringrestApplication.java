package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springrest.springrest.dao.loaddao;
@SpringBootApplication
public class SpringrestApplication {

	@Autowired
	private loaddao loaddao;
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	

}
