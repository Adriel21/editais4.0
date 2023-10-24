package br.gov.br.franciscomorato.editais.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
public class Role implements GrantedAuthority
{
    @Id
    private Integer id;

    private String  name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
