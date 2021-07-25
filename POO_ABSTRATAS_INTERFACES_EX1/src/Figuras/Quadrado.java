/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Roberto Leite
 */
public class Quadrado extends Retangulo {
    
    protected float lado;
    
    //não faz sentido esse lado, já que ele recebe dois lados do retangulo
    public Quadrado(float area, float perimetro, float lado1, float lado2, float lado) {
        super(area, perimetro, lado1, lado2);
        this.lado = lado;
    }

   
    
   
    
    
    
    @Override
    public  void calcularArea(){
        
    }
    
    @Override
    public  void calcularPerimetro(){
    
    
    }
    
}
