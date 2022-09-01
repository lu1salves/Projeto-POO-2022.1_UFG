package com.br.escolar.domain.dto;

import com.br.escolar.domain.Professor;
import com.br.escolar.domain.Turma;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class ProfessorDto {

    private String matricula;

    private String nome;

    private List<Turma> turmas = new ArrayList<>();



    public ProfessorDto(Optional<Professor> professor) {
        this.matricula = professor.get().getMatricula();;
        this.nome = professor.get().getNome();
        this.turmas = professor.get().getTurmas();
    }



    public ProfessorDto(Professor professor) {
        this.matricula = professor.getMatricula();;
        this.nome = professor.getNome();
        this.turmas = professor.getTurmas();
    }


}
