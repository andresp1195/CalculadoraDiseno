/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import calculadoradiseño.*;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Andres
 */
public class CreadorOperacion { //ShapeFactory
    public CreadorOperacion(){
    }
    
    
    public static IOperacion Asignar(DTO Peticion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        //Reflexión para saber cual operación llamar
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();        
        
        try{
            IOperacion operacion = (IOperacion) InstanciaAsignada;            
            return operacion;
         }
         catch(Exception e){
             return null;
         }
         
        //return null;
    }
}
