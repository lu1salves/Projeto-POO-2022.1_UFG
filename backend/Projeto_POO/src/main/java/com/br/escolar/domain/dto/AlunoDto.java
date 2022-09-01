package com.br.escolar.domain.dto;

import com.br.escolar.domain.Aluno;
import com.br.escolar.domain.Professor;
import com.br.escolar.domain.Turma;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class AlunoDto {

    private String matricula;

    private String nome;

    private List<Turma> turmas = new ArrayList<>();



    public AlunoDto(Optional<Aluno> aluno) {
        this.matricula = aluno.get().getMatricula();;
        this.nome = aluno.get().getNome();
        this.turmas = aluno.get().getTurmas();
    }



    public AlunoDto(Aluno aluno) {
        this.matricula = aluno.getMatricula();;
        this.nome = aluno.getNome();
        this.turmas = aluno.getTurmas();
    }
}
