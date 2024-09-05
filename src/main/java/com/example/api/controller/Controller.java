package com.example.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Client;
import com.example.api.repository.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Controller {

    @Autowired 
    private Repository acao;

    @GetMapping("/")
    public Iterable<Client> teste() {
        return acao.findAll();
    }
    
    @PostMapping("/")// rota de listagem
    public Client createClient(@RequestBody Client client) { // recebe o corpo de requerimento
        return acao.save(client);
    }
    @PutMapping("/")// rota de edição
    public Client updateClient(@RequestBody Client client) {
        return acao.save(client);// O save() faz cria e atualiza
        // idetifica quando é para realizar uma atualização quando passamos o ID
    }
    // rota de remoção
    @DeleteMapping("/{code}") // Passamo via URL o código do usário
    public void deleteClient(@PathVariable long code) { // o parâmetro será vinculado ao modelo de URL
        acao.deleteById(code);
    }

}
