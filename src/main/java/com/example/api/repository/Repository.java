package com.example.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.api.model.Client;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository <Client, Long>{ // Disponibiliza para API ações SQL para manipular Client e o tipo(classe invroluco) do seu ID
    

}
