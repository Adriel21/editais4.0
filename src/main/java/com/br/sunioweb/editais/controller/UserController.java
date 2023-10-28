package com.br.sunioweb.editais.controller;


import java.util.List;

import com.br.sunioweb.editais.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.sunioweb.editais.model.User;
import com.br.sunioweb.editais.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping
    public ResponseEntity<List<User> > listALL() {
        return new ResponseEntity<>(userService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/find")
    public ResponseEntity<User > findById(@RequestParam  Long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public User save(@RequestBody UserDTO userDTO)
    {
        User user = new User(userDTO.getUsername(), userDTO.getPassword());
        userService.save(user);
        return user;
    }

    @DeleteMapping
    public List<User> delete(@RequestParam Long id)
    {
        userService.deleteForId(id);
        return userService.listAll();
    }

    @PatchMapping
    public User update(@RequestBody UserDTO userDTO)
    {
        return userService.update(userDTO);
    }


}
