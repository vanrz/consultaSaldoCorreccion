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
public interface interfazVista {
    void setControlConsulta(Controlador c);
    void arranca();
    
    double getloqueHay();
    void escribeSaldo( String s);
    
    /**
     *
     */
    static final String CONS=" colsultaaar";
    
    
   
}
