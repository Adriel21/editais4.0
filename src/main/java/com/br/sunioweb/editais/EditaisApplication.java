package com.br.sunioweb.editais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.br.sunioweb.editais.model.Role;
import com.br.sunioweb.editais.model.User;
import com.br.sunioweb.editais.repository.RoleRepository;
import com.br.sunioweb.editais.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})

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
@EnableJpaRepositories("com.br.sunioweb.editais.repository")

public class EditaisApplication 
{
	@Autowired
	private RoleRepository RoleRepository;

	@Autowired
	private UserService userService;
	
//	@PostConstruct
//	public void createDefaultUser()
//	{
//
//			Role roleComum = new Role("ROLE_COMUM");
//			Role roleAdmin = new Role("ROLE_ADMIN");
//			Role roleRoot = new Role("ROLE_ROOT");
//
//			RoleRepository.save(roleComum);
//			RoleRepository.save(roleAdmin);
//			RoleRepository.save(roleRoot);
//
//			userService.save(new User("admin", "123",new Role("ROLE_ADMIN")));
//
//	}
	public static void main(String[] args) {
		SpringApplication.run(EditaisApplication.class, args);
	}

}
