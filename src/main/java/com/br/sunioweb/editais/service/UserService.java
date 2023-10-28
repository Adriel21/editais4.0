package com.br.sunioweb.editais.service;

import java.util.List;

import com.br.sunioweb.editais.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sunioweb.editais.model.User;
import com.br.sunioweb.editais.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User save (User user)
    {
        return userRepository.save(user);
    }

    public List<User> listAll()
    {
        return userRepository.findAll();
    }

    public  void deleteForId(Long id){
        userRepository.deleteById(id);
    }

    public User findById(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public  User update(UserDTO userDTO)
    {
        User user = this.findById(userDTO.getId());
        user.setUsername( userDTO.getUsername());
        user.setPassword( userDTO.getPassword());
        return user;
    }
}
