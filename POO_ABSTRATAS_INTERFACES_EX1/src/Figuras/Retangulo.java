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
public class Retangulo extends FiguraGeometrca {
  
    protected float lado1;
    protected float lado2;

    public Retangulo(float area, float perimetro, float lado1, float lado2) {
        super(area, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public  void calcularArea(){
        
    }
    
    @Override
    public  void calcularPerimetro(){
    
    
    }
}
