package com.br.escolar.domain.dto;

import com.br.escolar.domain.Aluno;
import com.br.escolar.domain.Professor;
import com.br.escolar.domain.Turma;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class TurmaDto {

    private String codigoTurma;

    private String nome;

    private List<Aluno> alunos = new ArrayList<>();

    private String nomeProfessor;


    public TurmaDto(Optional<Turma> turma) {
        this.codigoTurma = turma.get().getCodigoTurma();;
        this.nome = turma.get().getNome();
        this.alunos = turma.get().getAlunos();
        this.nomeProfessor = turma.get().getProfessor().getNome();
    }



    public TurmaDto(Turma turma) {
        this.codigoTurma = turma.getCodigoTurma();;
        this.nome = turma.getNome();
        this.alunos = turma.getAlunos();
        this.nomeProfessor = turma.getProfessor().getNome();
    }


}
