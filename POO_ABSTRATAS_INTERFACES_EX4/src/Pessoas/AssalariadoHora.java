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
public class AssalariadoHora extends Funcionario {
    
    protected int cargaHoraria;
    protected int cargaHorariaReal;
    protected double valHoraExtra;
    protected double qtdHoraExtra;
    

    public AssalariadoHora(int cargaHoraria, String nome, String endereco, String funcao, int matricula, double salario) {
        super(nome, endereco, funcao, matricula, salario);
        this.cargaHoraria = cargaHoraria;
    }

    public double calculaHoraExtra(){
        // 
        double valHora = (salario / cargaHoraria);
        valHoraExtra = valHora + (valHora/2);
        return valHoraExtra;
    }
    
    @Override
    public double calculaSalario() {
        
        this.qtdHoraExtra = cargaHorariaReal - cargaHoraria;
        
        salario = (qtdHoraExtra * calculaHoraExtra()) + salario;
        
        return salario;
        
       
    }
    
}
