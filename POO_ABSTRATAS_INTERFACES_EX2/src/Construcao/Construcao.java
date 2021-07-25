/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcao;

import EmiteCarbono.CarbonFootprint;

/**
 *
 * @author Roberto Leite
 */
public class Construcao implements CarbonFootprint {
    
    private int numPessoas;
    private int numLampadas;
    private boolean isEnergiaRenovavel;
    private boolean isArCondicionado;

    public Construcao(int numPessoas, int numLampadas, boolean isEnergiaRenovavel, boolean isArCondicionado) {
        this.numPessoas = numPessoas;
        this.numLampadas = numLampadas;
        this.isEnergiaRenovavel = isEnergiaRenovavel;
        this.isArCondicionado = isArCondicionado;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public int getNumLampadas() {
        return numLampadas;
    }

    public boolean isIsEnergiaRenovavel() {
        return isEnergiaRenovavel;
    }

    public boolean isIsArCondicionado() {
        return isArCondicionado;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    public void setIsEnergiaRenovavel(boolean isEnergiaRenovavel) {
        this.isEnergiaRenovavel = isEnergiaRenovavel;
    }

    public void setIsArCondicionado(boolean isArCondicionado) {
        this.isArCondicionado = isArCondicionado;
    }
    
    
    public void addPessoas(int num){
        
        numPessoas += numPessoas;
        
    }
    
    public void addLampadas(int num){
        
        numLampadas += num;
        
    }

    @Override
    public void getCarbonFootprint() {
       System.out.println("Emissão de carbono anual da construcao: ");
       
    }
    
    
    
    
}
