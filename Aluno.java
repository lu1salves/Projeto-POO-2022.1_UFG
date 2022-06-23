package poo2022_1.sistema_academico;

/**
 * Espaço reservado para documentação de código
 * Rafaela Montes
 * digite o nome do autor do código na linha superior
 */

import java.util.Calendar;

public class Aluno extends Pessoa {

     public int matricula;
     public int conclusaoEnsinoMedio;
     public String cpf;
     public Calendar nascimento;
     
     public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getConclusaoEnsinoMedio() {
        return conclusaoEnsinoMedio;
    }

    public void setConclusaoEnsinoMedio(int conclusaoEnsinoMedio) {
        this.conclusaoEnsinoMedio = conclusaoEnsinoMedio;
    }
    
    
}
