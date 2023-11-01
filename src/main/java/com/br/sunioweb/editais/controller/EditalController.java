package com.br.sunioweb.editais.controller;

import com.br.sunioweb.editais.dto.response.ResponseDTO;
import com.br.sunioweb.editais.dto.response.ResponseDataDTO;
import com.br.sunioweb.editais.dto.edital.PatchEditalDTO;
import com.br.sunioweb.editais.dto.edital.PostEditalDTO;
import com.br.sunioweb.editais.model.Edital;
import com.br.sunioweb.editais.service.EditalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edital")
public class EditalController {

    @Autowired
    private EditalService editalService;

    @GetMapping
    public  ResponseDataDTO list ()
    {
        var editaisList = editalService.list();
        return new ResponseDataDTO("sucesso","200",editaisList);
    }

    @PostMapping
    public ResponseDataDTO save (@RequestBody PostEditalDTO data)
    {
        var newEdital =  editalService.save(new Edital(data.name(),data.number()));
        return new ResponseDataDTO("Edital salvo com sucesso","200",newEdital);

    }

    @PatchMapping
    public ResponseDataDTO update(@RequestBody @Valid PatchEditalDTO data)
    {
        var newEdital = editalService.save(new Edital(data.id(), data.name(), data.number()));
        return new ResponseDataDTO("Edital atualizado","200",newEdital);
    }

    @DeleteMapping
    public ResponseDTO delete(@RequestParam Long id)
    {
        editalService.delete(id);
        return new ResponseDTO("Edital atualizado","200");
    }

}
