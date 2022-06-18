package poo2022_1.sistema_academico;

/**
 * Classe mãe para representar as pessoas que utiizarão o sistema 
 * atributo nome = nome da pessoa, o acesso tem de ser público
 * atributo codigo = número que identifica o o usuário no sistema
 * atributo salario = número que representa o salário do usuário, se for estudante salario == 0.0f
 * @author Luís Henrique
 */
 

public class Pessoa {
    public String nome;
    private int codigo;
    private float salario;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
}
