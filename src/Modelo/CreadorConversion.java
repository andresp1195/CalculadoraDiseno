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
    public CreadorConversion(DTO MiDTO){
        this.MiDTO=MiDTO;
}
    public static IConversion Asignar(DTO Peticion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        //Method MetodoDeseado = ClaseAsignada.getMethod("Convertir",new Class[]{int.class});        
        //Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{}).newInstance(new Object[] {});
        Object InstanciaAsignada = ClaseAsignada.getConstructor().newInstance();
        /*
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);
        */
         try{
            IConversion conversion = (IConversion) InstanciaAsignada;
            /*for (int i=1;i<tamano;i++){            
                elementoActualDeLaLista = Peticion.lista.get(i);
                resultadoTotal = Float.parseFloat(operacion.Calcular(resultadoTotal, elementoActualDeLaLista));
            }*/
            return conversion;
         }
         catch(Exception e){
             return null;
         }
         
        //return null;
    }
    public static DTO Efectuar(DTO Peticion, IConversion Conversion){
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