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
    public static DTO Efectuar(DTO Peticion, IOperacion Operacion){
        //validar que todos los parametros de la lista sean enteros positivos
        if (!(ValidarLista.Validar(Peticion.lista))){
            //Meter el error en el DTO
            Peticion.error = true;
            Peticion.mensaje_error = "Existe un operando menor que cero.";
            return Peticion;
        }
        
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);
        
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            if (Operacion.Validar(resultadoTotal, elementoActualDeLaLista)){
                resultadoTotal = Float.parseFloat(Operacion.Calcular(resultadoTotal, elementoActualDeLaLista));
            }
            else{
                Peticion.error = true;
                Peticion.mensaje_error = "Algún operando no cumplió con la validación correspondiente.";
                return Peticion;
            }
        }
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }
}
