/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

/**
 *
 * @author Roberto Leite
 */
public class Comissionado extends Funcionario {
    
    protected int valVenda;

    public Comissionado(String nome, String endereco, String funcao, int matricula, double salario) {
        super(nome, endereco, funcao, matricula, salario);
    }

    public int getValVenda() {
        return valVenda;
    }

    public void setValVenda(int valVenda) {
        this.valVenda = valVenda;
    }

   
    @Override
    public double calculaSalario() {
        this.salario = valVenda * 0.20;
        return salario *0.10;
        
    }
    
}
