package com.batarangsolutionsspringmysql.demo;

import com.batarangsolutionsspringmysql.demo.principal.BatsiController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BatsiController principal = new BatsiController();
		principal.muestraElMenu();
			}
		}


