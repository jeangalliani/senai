package br.sc.senai.testeintegrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TesteintegradoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteintegradoApplication.class, args);
	}

}
