package poo2022_1.sistema_academico;

/**
 * Espaço reservado para documentação de código
 * 
 * atributos
 * atributo area_pesquisa = área de pesquisa na qual o professor atua
 * atributo graduacao = área na qual o professor se graduou
 * atributo data_graduação = ano no qual o professor se graduou
 * atributo mestrado = área na qual o professor se especializou
 * atributo data_mestrado = ano no qual o professor fez o mestrado
 * atributo doutorado = área na qual o professor realizou o doutorado
 * atributo data_doutorado = ano no qual o professor realizou o doutorado
 * atributo materia = matéria que o professor ministra na Universidade
 * 
 * @author Luís Henrique
 * 
 */

public class Professor extends Pessoa {
    public String area_pesquisa;
    public String graduacao;
    public int data_graduacao;
    public String mestrado;
    public int data_mestrado;
    public String doutorado;
    public int data_doutorado;
    public String materia;


    //gets 

    public String getArea_pesquisa() {
        return area_pesquisa;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public int getData_graduacao() {
        return data_graduacao;
    }

    public String getMestrado() {
        return mestrado;
    }

    public int getData_mestrado() {
        return data_mestrado;
    }

    public String getDoutorado() {
        return doutorado;
    }

    public int getData_doutorado() {
        return data_doutorado;
    }

    public String getMateria() {
        return materia;
    }
    
    //setters

    public void setArea_pesquisa(String area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public void setData_graduacao(int data_graduacao) {
        this.data_graduacao = data_graduacao;
    }

    public void setMestrado(String mestrado) {
        this.mestrado = mestrado;
    }

    public void setData_mestrado(int data_mestrado) {
        this.data_mestrado = data_mestrado;
    }

    public void setDoutorado(String doutorado) {
        this.doutorado = doutorado;
    }

    public void setData_doutorado(int data_doutorado) {
        this.data_doutorado = data_doutorado;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    //Construtor

    public Professor(String area_pesquisa, String graduacao, int data_graduacao, String mestrado, int data_mestrado, String doutorado, int data_doutorado, String materia, String nome, int codigo, float salario) {
        super(nome, codigo, salario);
        this.area_pesquisa = area_pesquisa;
        this.graduacao = graduacao;
        this.data_graduacao = data_graduacao;
        this.mestrado = mestrado;
        this.data_mestrado = data_mestrado;
        this.doutorado = doutorado;
        this.data_doutorado = data_doutorado;
        this.materia = materia;
    }
    
    
}



