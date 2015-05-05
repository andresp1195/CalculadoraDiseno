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
         float resultadoTotal;
         float elementoActualDeLaLista;
         int tamano = Peticion.lista.size();
         resultadoTotal = Peticion.lista.get(0);
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        Method MetodoDeseado = ClaseAsignada.getMethod("Calcular",new Class[]{float.class,float.class});        
        Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{}).newInstance(new Object[] {});
        
         for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            resultadoTotal = Float.parseFloat(MetodoDeseado.invoke(InstanciaAsignada,new Object[]{resultadoTotal,elementoActualDeLaLista}).toString());
         }System.out.println(resultadoTotal);
        return null;
    }
}
