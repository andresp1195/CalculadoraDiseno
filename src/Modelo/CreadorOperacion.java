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
public class CreadorOperacion { //ShapeFactory
    public DTO MiDTO;
    public CreadorOperacion(DTO MiDTO){
        this.MiDTO=MiDTO;
    }
    
    
    public static IOperacion Asignar(DTO Peticion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
       // Method MetodoDeseado = ClaseAsignada.getMethod("Calcular",new Class[]{float.class,float.class});        
        //Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{}).newInstance(new Object[] {});
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();
        /*
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);
        */
         try{
            IOperacion operacion = (IOperacion) InstanciaAsignada;            
            return operacion;
         }
         catch(Exception e){
             return null;
         }
         
        //return null;
    }
    public static DTO Efectuar(DTO Peticion, IOperacion Operacion){
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);
        
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            resultadoTotal = Float.parseFloat(Operacion.Calcular(resultadoTotal, elementoActualDeLaLista));
        }
        
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }
}
