package com.br.escolar.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Professor {

    @Id
    private String matricula;

    @NotBlank
    @Size(min = 6, max = 100)
    private String nome;

    @OneToMany(mappedBy = "professor")
    @JsonIgnore
    private List<Turma> turmas = new ArrayList<>();

}
