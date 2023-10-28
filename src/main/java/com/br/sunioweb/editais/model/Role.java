/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sunioweb.editais.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author vinicius
 */
@Entity
@Data
public class Role implements GrantedAuthority
{
    @Id
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }

    public Role()
    {
        
    }

    public Role(String role)
    {
        this.name = role;
    }
}
