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
public class Tarjetademrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //modelo
        Modelo miModelo=new Modelo();
        
        //vista
        interfazVista miVista=new Vista();
        
        //controlador
        Controlador control=new Controlador(miVista,miModelo);
        miVista.setControlConsulta(control);
        
        miVista.arranca();
    }
    
}
