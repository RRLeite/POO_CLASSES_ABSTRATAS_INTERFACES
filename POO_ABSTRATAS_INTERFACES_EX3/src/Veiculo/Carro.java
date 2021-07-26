/*
 	Carro: combustível (string), cilindrada (float).
 */
package Veiculo;

import EmiteCarbono.CarbonFootprint;

/**
 *
 * @author Roberto Leite
 */
public class Carro implements CarbonFootprint {
    
    private String modelo;
    private String fabricante;
    private String combustivel;
    private int cilindrada;
    private int litrosCombustivel;

    public Carro(String modelo, String fabricante, String combustivel, int cilindrada, int litrosCombustivel) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
        this.litrosCombustivel = litrosCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public float getCilindrada() {
        return cilindrada;
    }
    
    
    
    public void abastecimento (int litros){
        
        litrosCombustivel= litrosCombustivel + litros;
        
    }
    
    public void mostraCombustivel (){
       System.out.println("O carro tem: "+litrosCombustivel+" litros");
   
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println("Emissão de carbono anual do carro: ");
    }
    
    
}
