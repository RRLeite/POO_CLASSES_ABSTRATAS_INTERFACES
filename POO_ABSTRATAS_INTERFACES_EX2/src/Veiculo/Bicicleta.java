/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculo;

import EmiteCarbono.CarbonFootprint;

/**
 *
 * @author Roberto Leite
 */
public class Bicicleta implements CarbonFootprint {
    
    private String modelo;
    private String fabricante;
    private int tamanhoAro;

    public Bicicleta(String modelo, String fabricante, int tamanhoAro) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tamanhoAro = tamanhoAro;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public float getTamanhoAro() {
        return tamanhoAro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }
    
    
    
    public void mostraModelo(){
        
        System.out.println("O modelo e: "+ modelo);
    }
    
    public void mostraFabricante(){
        
        System.out.println("O modelo e: "+ fabricante);
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println("Emissão de carbono anual da bicicleta : ");
    }
    
    
}
