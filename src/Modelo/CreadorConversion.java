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
    public CreadorConversion(){
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
        String resultadoTotal = "";
        int elementoActualDeLaLista;
        int tamano = Peticion.lista.size();    
        for (int i=0;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            if (!(Conversion.Validar(Peticion.lista.get(i)))){
                Peticion.error = true;
                Peticion.mensaje_error = "Algún operando no cumplió con la validación correspondiente.";
                return Peticion;
            }
            resultadoTotal = Conversion.Convertir(elementoActualDeLaLista);
        }
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }



}