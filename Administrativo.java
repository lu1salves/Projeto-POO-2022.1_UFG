package poo2022_1.sistema_academico;

/**
 * Espaço reservado para documentação de código
 * 
 * atributos 
 * atributo cargo = cargo exercido pelo servidor
 * atributo unidade = unidade ou orgão administrativo para qual o servidor trabalha
 * atributo graduacao = área na qual o servidor se graduou
 * atributo conc_graduacao = ano em que o servidor terminou sua graduaçao
 * 
 * @author Gustavo Henrique
 *
 */

public class Administrativo extends Pessoa{
    public String cargo;
    public String unidade;
    public String graduacao;
    public int conc_graduacao;
    
    // getters
    public String getCargo() {
        return cargo;
    }
    public String getUnidade() {
        return unidade;
    }
    public String getGraduacao() {
        return graduacao;
    }
    public int getConc_graduacao() {
        return conc_graduacao;
    }
    
    // setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public void setConc_graduacao(int conc_graduacao) {
        this.conc_graduacao = conc_graduacao;
    }
    
    //construtor
    public Administrativo(String cargo, String unidade, String graduacao, int conc_graduacao, String nome, int codigo, float salario){
        super(nome, codigo, salario);
        this.cargo = cargo;
        this.unidade = unidade;
        this.graduacao = graduacao;
        this.conc_graduacao= conc_graduacao;
    }
        
    
}
