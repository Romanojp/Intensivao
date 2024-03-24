package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
     var cliente1 = new Cliente();
     cliente1.setId(1);
     cliente1.setNome("João Romana");
     cliente1.setTelefone("12438461132132");
     cliente1.setEmail("Joao@Gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Thais");
        cliente2.setTelefone("1251408610");
        cliente2.setEmail("thais@Gmail.com");

        return Arrays.asList(cliente1, cliente2);

    }
}
