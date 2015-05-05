/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import calculadoradiseño.IOperacion;
import calculadoradiseño.DTO;
import calculadoradiseño.*; 
import Modelo.*; 
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Mauricio Gamboa
 */
public class Controlador {
    public DTO MiDTO; 
    
    public Controlador(DTO MiDTO) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        this.MiDTO=MiDTO;         
        enviar_solicitud(MiDTO);
        
    }
    
    public static DTO enviar_solicitud(DTO MiDTO) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class ClaseAsignada = Class.forName("calculadoradiseño.I"+MiDTO.tipo);
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();
        return null;
    }    
}
