/*
 Resposta da pergunta: Não vai funcionar por que a classe construção ficou como abstrata e classes abstratas 
 não podem ser instanciadas. Fiz uma instancia para cada objeto que extendia de construcao;
 */
package Main;

import Construcao.Casa;
import Construcao.Construcao;
import Construcao.Escola;
import EmiteCarbono.CarbonFootprint;
import Veiculo.Bicicleta;
import Veiculo.Carro;
import java.util.ArrayList;

/**
 *
 * @author Roberto Leite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciando construcao
        Construcao casa1 = new Casa("Casa1",10,5,true,false);
        Construcao escola1 = new Escola("Escola1",10,5,false,true);
        
        //instanciando bicicleta
        Bicicleta b1 = new Bicicleta ("Modelo 1", "Fabricante 1", 26);
        Bicicleta b2 = new Bicicleta ("Modelo 2", "Fabricante 6", 20);
        
        //instanciando carro
        
        Carro carro1 = new Carro ("Mobi", "Fiat", "Flex", 1100, 50);
        Carro carro2 = new Carro ("Palio", "Fiat", "Flex", 1300, 50);
        
        ArrayList<CarbonFootprint> carbon = new ArrayList<CarbonFootprint>(); 
        
        carbon.add(casa1);
        carbon.add(escola1);
        carbon.add(b1);
        carbon.add(b2);
        carbon.add(carro1);
        carbon.add(carro2);
        
        for (CarbonFootprint c : carbon){
            
            c.getCarbonFootprint();
            
        }
        
       
    
    
    
    }
}
