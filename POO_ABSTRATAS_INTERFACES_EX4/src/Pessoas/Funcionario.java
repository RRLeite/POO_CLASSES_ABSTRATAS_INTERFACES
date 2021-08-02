/*
4.[1,5 ponto] Uma empresa paga seus funcionários semanalmente. Os funcionários são de quatro tipos: 
Funcionários assalariados recebem salários fixos semanais independentemente do número de horas trabalhadas, 
funcionários que trabalham por hora são pagos da mesma forma e recebem horas extras 
(isto é, 1,5 vezes sua taxa de salário por hora) 
por todas as horas trabalhadas além das 40 horas normais, 
funcionários comissionados recebem uma porcentagem sobre suas vendas e funcionários assalariados/ comissionados
recebem um salário-base mais uma porcentagem sobre suas vendas. Para o período salarial atual, 
a empresa decidiu recompensar os funcionários assalariados/comissionados adicionando 10% aos seus salários-base. 
A empresa quer escrever um programa em Java que realiza os cálculos da folha de pagamento polimorficamente.
 */
package Pessoas;

/**
 *
 * @author Roberto Leite
 */
public abstract class Funcionario {
    
    protected String nome;
    protected String endereco;
    protected String funcao;
    protected int matricula;
    protected double salario;
    

    public Funcionario(String nome, String endereco, String funcao, int matricula, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.funcao = funcao;
        this.matricula = matricula;
        this.salario = salario;
        
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calculaSalario();
    
   
    
    
}
