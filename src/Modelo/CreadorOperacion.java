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
    public CreadorOperacion(){
//        this.MiDTO=MiDTO;
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
