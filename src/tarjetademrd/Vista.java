/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetademrd;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Vista extends JFrame implements interfazVista  {
    
    private final JButton consultarr;
    private JLabel codigo;
    private final JLabel saldo;
    private final JTextField loqueHay;
    
    public Vista (){
        
        super ("Consulta  tu saldo");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelPrincipal=new JPanel();
        panelPrincipal.setLayout (new BorderLayout(20,20));
        
        codigo=new JLabel("Ingrese su codigo");
        JPanel panelaux3=new JPanel(); panelaux3.add(codigo);
        panelPrincipal.add(panelaux3,BorderLayout.LINE_START);
        
        
        loqueHay=new JTextField(25);
        JPanel panelaux=new JPanel(); panelaux.add(loqueHay);
        panelPrincipal.add(panelaux, BorderLayout.CENTER);
        
        
        
        
        saldo=new JLabel("el SALDO es ");
        JPanel panelaux2=new JPanel(); panelaux2.add(saldo);
        panelPrincipal.add(panelaux2,BorderLayout.AFTER_LINE_ENDS);
      
        
        consultarr=new JButton("Consultar Saldo");
        consultarr.setActionCommand(CONS);
        
        JPanel botoncito=new JPanel();
        botoncito.add(consultarr);
        panelPrincipal.add(botoncito, BorderLayout.PAGE_END);
        
        getContentPane().add(panelPrincipal);
        
      
   
    }
  public void escribeSaldo( String s){
        saldo.setText(s);
    }  
    public double getloqueHay(){
        try{
            return Double.parseDouble(loqueHay.getText());
        }
        catch(NumberFormatException e){
            return 0.0;
        }
        
    }
    
    public void  setControlConsulta(Controlador c){
        
        consultarr.addActionListener(c);
        
    }
    public void arranca(){
        pack();//coloca componentes
        setLocationRelativeTo(null);//centra ventana
        setVisible(true);
    }
    
}
