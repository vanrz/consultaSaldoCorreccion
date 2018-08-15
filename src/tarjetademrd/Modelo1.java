/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetademrd;

/**
 *
 * @author usuario
 */
public class Modelo1 {
    private final double miCodigo;
    
        public Modelo1 (int elCodigo){
        miCodigo= elCodigo;
    }
     public double saldo (double loqueHay){
    return ((loqueHay/loqueHay)+(Math.random()*50000));
    }
    
    
}
