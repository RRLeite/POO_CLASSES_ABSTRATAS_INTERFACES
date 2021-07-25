/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import Figurageometrica.FiguraGeometrca;

/**
 *
 * @author Roberto Leite
 */
public class Circulo extends FiguraGeometrca {
    
    protected float raio;

    public Circulo(float area, float perimetro, float raio) {
        super(area, perimetro);
        this.raio=raio;
    }

   
    @Override
    public  void calcularArea(){
        
    }
    
    @Override
    public  void calcularPerimetro(){
    
    
    }
}
