package com.br.sunioweb.editais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class

@ComponentScan(basePackages = {
		"com.br.sunioweb.editais.config",
		"com.br.sunioweb.editais.controller",
		"com.br.sunioweb.editais.controller",
		"com.br.sunioweb.editais.model",
		"com.br.sunioweb.editais.service",
		"com.br.sunioweb.editais.ultil",
		"com.br.sunioweb.editais.repository"
})
@EntityScan(basePackages = {"com.br.sunioweb.editais.model"})

public class EditaisApplication 
{


	public static void main(String[] args) {
		SpringApplication.run(EditaisApplication.class, args);
	}

}
