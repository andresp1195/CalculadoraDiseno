/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradiseño;

import java.lang.reflect.InvocationTargetException;
/**
 *
 * @author Andres
 */
public class CalculadoraDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        //VISTA MODO CARACTER
        //VistaModoCaracter.ModoCaracter mc= new VistaModoCaracter.ModoCaracter();
        //mc.operar(); 
        
        //VISTA GUI
        VistaGUI.VentanaPrincipalGUI ventanaPrincipal = new VistaGUI.VentanaPrincipalGUI();
        ventanaPrincipal.setVisible(true);
        
    }
    
}
