package poo2022_1.sistema_academico;

/**
 * Espaço reservado para documentação de código
 * 
 * atributos
 * atributo data_acesso = data em que foi feito o acesso
 * atributo instituicao = vínculo com a instituição?
 * 
 * @author Marco Mendes
 * 
 */

public class Aluno extends Pessoa{
    public int data_acesso;
    public boolean instituicao;

    public int getData_acesso() {
        return data_acesso;
    }

    public boolean isInstituicao() {
        return instituicao;
    }

    public void setData_acesso(int data_acesso) {
        this.data_acesso = data_acesso;
    }

    public void setInstituicao(boolean instituicao) {
        this.instituicao = instituicao;
    }

    public Aluno(String nome, int codigo, int data_acesso, boolean instituicao) {
        super(nome);
        this.data_acesso = data_acesso;
        this.instituicao = instituicao;
    }
    
}