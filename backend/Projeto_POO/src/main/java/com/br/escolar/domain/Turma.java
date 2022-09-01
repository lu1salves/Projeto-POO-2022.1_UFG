package com.br.escolar.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Turma {

    @Id
    private String codigoTurma;

    @NotBlank
    @Size(min = 6, max = 100)
    private String nome;

    @ManyToMany
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "matricula_professor")
    private Professor professor;

}
