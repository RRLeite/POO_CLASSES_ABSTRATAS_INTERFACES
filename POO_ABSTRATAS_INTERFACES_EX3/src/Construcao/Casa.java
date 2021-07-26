/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcao;

/**
 *
 * @author Roberto Leite
 */
public class Casa extends Construcao {
    
    protected String nomeCasa;
    public Casa(String nomeCasa, int numPessoas, int numLampadas, boolean isEnergiaRenovavel, boolean isArCondicionado) {
        super(numPessoas, numLampadas, isEnergiaRenovavel, isArCondicionado);
        this.nomeCasa = nomeCasa;
    }
    
    @Override
    public int getNumPessoas() {
        return numPessoas;
    }

    @Override
    public int getNumLampadas() {
        return numLampadas;
    }

    @Override
    public boolean isIsEnergiaRenovavel() {
        return isEnergiaRenovavel;
    }

    @Override
    public boolean isIsArCondicionado() {
        return isArCondicionado;
    }

    @Override
    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    @Override
    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    @Override
    public void setIsEnergiaRenovavel(boolean isEnergiaRenovavel) {
        this.isEnergiaRenovavel = isEnergiaRenovavel;
    }

    @Override
    public void setIsArCondicionado(boolean isArCondicionado) {
        this.isArCondicionado = isArCondicionado;
    }
    
    
    @Override
    public void addPessoas(int num){
        
        numPessoas += numPessoas;
        
    }
    
    @Override
    public void addLampadas(int num){
        
        numLampadas += num;
        
    }

    @Override
    public void getCarbonFootprint() {
       System.out.println("Emissão de carbono anual da casa: ");
       
    }
    
    
    
}
