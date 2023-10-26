package com.br.sunioweb.editais.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/home")
    public ResponseEntity<String> exemplo() {
        String mensagem = "Isso é um exemplo de resposta com ResponseEntity!";
        return  new ResponseEntity<String>(mensagem, HttpStatus.OK);
    }

}
