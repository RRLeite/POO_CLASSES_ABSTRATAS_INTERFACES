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
public class Triangulo extends FiguraGeometrca {
    
    protected float base;
    protected float altura;

    public Triangulo(float area, float perimetro, float base, float altura) {
        super(area, perimetro);
        this.base= base;
        this.altura=altura;
    }
    
    @Override
    public  void calcularArea(){
        
    }
    
    @Override
    public  void calcularPerimetro(){
    
    
    }
    
    
}
