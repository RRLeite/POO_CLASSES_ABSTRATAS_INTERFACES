/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Figuras.Circulo;
import Figuras.Triangulo;

/**
 *
 * @author Roberto Leite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo traingulo = new Triangulo(1,1,1,1);
        
        Circulo circulo = new Circulo (1,1,1);
        
        System.out.println(circulo.getArea());
        
    }
    
}
