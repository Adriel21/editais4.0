package com.br.sunioweb.editais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})

@ComponentScan(basePackages = {
		"com.br.sunioweb.editais.config",
		"com.br.sunioweb.editais.controller",
		"com.br.sunioweb.editais.model",
//		"com.br.sunioweb.editais.service",
//		"com.br.sunioweb.editais.ultil",
		"com.br.sunioweb.editais.repository"
})
@EntityScan(basePackages = {"com.br.sunioweb.editais.model"})
@EnableJpaRepositories("com.br.sunioweb.editais.repository")

public class EditaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditaisApplication.class, args);
	}

}
