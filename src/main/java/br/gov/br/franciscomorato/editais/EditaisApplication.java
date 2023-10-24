package br.gov.br.franciscomorato.editais;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"br.gov.br.franciscomorato.editais.config",
		"br.gov.br.franciscomorato.editais.controller",
		"br.gov.br.franciscomorato.editais.model",
		"br.gov.br.franciscomorato.editais.repository",
		"br.gov.br.franciscomorato.editais.service",
		"br.gov.br.franciscomorato.editais.ultil"
})
@EntityScan(basePackages = {"br.gov.br.franciscomorato.editais.model"})

@EnableJpaRepositories(basePackages = {"br.gov.br.franciscomorato.editais.repository"})


@PostConstruct
public void createDefaultUser()
		{

		Role roleComum = new Role("ROLE_COMUM");
		Role roleAdmin = new Role("ROLE_ADMIN");
		Role roleRoot = new Role("ROLE_ROOT");

		RoleRepository.save(roleComum);
		RoleRepository.save(roleAdmin);
		RoleRepository.save(roleRoot);

		userService.save(new User("admin", password, new Role("ROLE_ADMIN")));
		}



public class EditaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditaisApplication.class, args);
	}

}
