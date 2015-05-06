/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.*;
import java.lang.reflect.InvocationTargetException;
/*
 *
 * @author Andres
 */
public class CreadorConversion {
    public CreadorConversion(){
}
    //Factory
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
}