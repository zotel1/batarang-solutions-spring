package com.batarangsolutionsspringmysql.demo;

import com.batarangsolutionsspringmysql.demo.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.batarangsolutionsspringmysql.demo.repository.InvestigadorRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application implements CommandLineRunner {




	@Autowired
	private InvestigadorRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
			}
		}


