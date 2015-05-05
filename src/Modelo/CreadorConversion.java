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
public class CreadorConversion {
    public DTO MiDTO;
    public CreadorConversion(){
        //this.MiDTO=MiDTO;
}
    public static IConversion Asignar(DTO Peticion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        //Reflexión para saber cual conversión llamar
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();

        try{
            IConversion conversion = (IConversion) InstanciaAsignada;
            return conversion;
         }
         catch(Exception e){
             return null;
         }
    }
    public static DTO Efectuar(DTO Peticion, IConversion Conversion){
        System.out.println("En efectuar: Conversion = "+Conversion);
        int resultadoTotal;
        int elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);        
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            resultadoTotal = Integer.parseInt(Conversion.Convertir(elementoActualDeLaLista));
        }
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }



}