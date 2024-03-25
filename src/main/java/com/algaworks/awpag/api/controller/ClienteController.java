package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import com.algaworks.awpag.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@RestController
public class ClienteController {

    private final ClienteRepository clienteRepository;


    @GetMapping("/clientes")
    public List<Cliente> listar(){
       // return clienteRepository.findByNome("joao");
        return clienteRepository.findByNomeContaining("th");


    }
}
