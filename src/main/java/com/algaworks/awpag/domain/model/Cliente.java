package com.algaworks.awpag.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String telefone;
}
