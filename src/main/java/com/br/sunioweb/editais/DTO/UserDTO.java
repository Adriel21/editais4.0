package com.br.sunioweb.editais.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @JsonProperty("id")
    private Long Id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
}
