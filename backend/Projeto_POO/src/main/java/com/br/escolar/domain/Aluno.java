package com.br.escolar.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Aluno {


    @Id
    private String matricula;

    @NotBlank
    @Size(min = 6, max = 100)
    private String nome;

    @ManyToMany
    @JoinTable(name = "turma_aluno",
            joinColumns = @JoinColumn(name = "matricula"),
            inverseJoinColumns = @JoinColumn(name = "codigoTurma"))
    private List<Turma> turmas = new ArrayList<>();



}

