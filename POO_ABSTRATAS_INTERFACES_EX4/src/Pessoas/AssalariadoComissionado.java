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
public class AssalariadoComissionado extends Funcionario {
    
    protected float valVenda;
    protected float comissao;

    public AssalariadoComissionado(String nome, String endereco, String funcao, int matricula, double salario) {
        super(nome, endereco, funcao, matricula, salario);
    }

    public float calculaComissao(){
      
        this.comissao = (float) (0.20 * valVenda);
        return comissao;
    }
    
    @Override
    public double calculaSalario() {
        
        salario = salario + comissao;
        return salario * 0.1;
        
    }
    
    
    
}
