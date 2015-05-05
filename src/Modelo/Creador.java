/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import Controlador.Controlador;
import calculadoradiseño.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Creador { //ShapeFactory
    public DTO MiDTO;
    public Creador(DTO MiDTO){
        this.MiDTO=MiDTO;
    }
    
    
    public static IOperacion AsignarOperacion(DTO Peticion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        Method MetodoDeseado = ClaseAsignada.getMethod("Calcular",new Class[]{float.class,float.class});        
        //Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{}).newInstance(new Object[] {});
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();
         
         try{
            //System.out.println("Interfaz conectada: "+ClaseAsignada.getInterfaces()[0]+"\nClase Asignada.isInterface(): "+ClaseAsignada.isInterface()+"\nInstancia Asignada: "+InstanciaAsignada.toString());
            IOperacion.class.cast(InstanciaAsignada);
            return (IOperacion) InstanciaAsignada;
         }
         catch(Exception e){
             return null;
         }
         
        //return null;
    }
}
