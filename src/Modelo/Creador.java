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
         int resultadoTotal;
         int elementoActualDeLaLista;
         int tamano = Peticion.lista.size();
         resultadoTotal = Peticion.lista.get(0);
        Class ClaseAsignada = Class.forName("Modelo."+Peticion.operacion);          
        Method MetodoDeseado = ClaseAsignada.getMethod("Calcular",new Class[]{int.class,int.class});
        //eAsignada.getConstructor(new Class[]{int.class,int.class}).newInstance(new Object[] {2,4});
        //COMO CHIMY LE GUSTARIA
        Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{}).newInstance(new Object[] {});
        
         for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            resultadoTotal = Integer.parseInt(MetodoDeseado.invoke(InstanciaAsignada,new Object[]{resultadoTotal,elementoActualDeLaLista}).toString());
            //System.out.println("Resultado Total = "+resultadoTotal);
            //MetodoDeseado.invoke(InstanciaAsignada,2,elementoActualDeLaLista);
         }
         
        
        
//        Este es el reflection que vamos a utilizar
        
        



//MetodoDeseado.invoke(InstanciaAsignada,operacionSeleccionada);
    //Metodo que prueba Reflection.
        
        //Object result = Creador.invoke(operacionSeleccionada.operacion,operacionSeleccionada);
        //return new Suma(operacionSeleccionada);
        return null;
    }
}
