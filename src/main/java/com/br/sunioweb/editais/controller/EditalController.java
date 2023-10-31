package com.br.sunioweb.editais.controller;

import com.br.sunioweb.editais.dto.edital.PatchEditalDTO;
import com.br.sunioweb.editais.dto.edital.PostEditalDTO;
import com.br.sunioweb.editais.model.Edital;
import com.br.sunioweb.editais.service.EditalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edital")
public class EditalController {

    @Autowired
    private EditalService editalService;

    @GetMapping
    public  ResponseEntity<List<Edital>> list ()
    {
        return new ResponseEntity<List<Edital>>(editalService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Edital> save (@RequestBody PostEditalDTO data)
    {
        Edital newEdital = new Edital(data.name(),data.number());
        return new ResponseEntity<Edital>(editalService.save(newEdital),HttpStatus.OK);

    }

    @PatchMapping
    public ResponseEntity<Edital> update(@RequestBody @Valid PatchEditalDTO data)
    {
        Edital newEdital = new Edital(data.id(), data.name(), data.number());
        return new ResponseEntity<Edital>(editalService.save(newEdital), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam Long id)
    {
        editalService.delete(id);
        return  new ResponseEntity<String>("Apagou",HttpStatus.OK);
    }






}
