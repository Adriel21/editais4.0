package com.br.sunioweb.editais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sunioweb.editais.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
