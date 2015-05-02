/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import calculadoradiseño.*; 
import Modelo.*; 

/**
 *
 * @author Mauricio Gamboa
 */
public class Controlador {
    public DTO MiDTO; 
    
    public Controlador(DTO MiDTO){
        this.MiDTO=MiDTO; 
        
    }
    
    public void enviar_solicitud() throws ClassNotFoundException{
        Creador m = new Creador(); 
        m.AsignarOperacion(MiDTO);
    }
}
