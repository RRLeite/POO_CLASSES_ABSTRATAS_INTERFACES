/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figurageometrica;



/**
 *
 * @author Roberto Leite
 */
public abstract class FiguraGeometrca {
    
    protected float area;
    protected float perimetro;

    public FiguraGeometrca(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    public  void calcularArea(){
        
    }
    
    public  void calcularPerimetro(){
    
    
    }
    
}
