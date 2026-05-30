package Tic.Implementacao.model;

import jakarta.persistence.MappedSuperclass;
@MappedSuperclass
public class Pessoa {
    protected String cpf;
    protected String nome;

}
