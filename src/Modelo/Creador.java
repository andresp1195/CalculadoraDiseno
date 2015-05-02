/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    
    public static IOperacion AsignarOperacion(DTO operacionSeleccionada) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class ClaseAsignada = Class.forName("Modelo."+operacionSeleccionada.operacion);          
        Method MetodoDeseado = ClaseAsignada.getMethod("Creador",new Class[]{DTO.class});
        Object InstanciaAsignada = ClaseAsignada.getConstructor(new Class[]{DTO.class}).newInstance(new Object[] {operacionSeleccionada});
        //MetodoDeseado.invoke(InstanciaAsignada,operacionSeleccionada);
    //Metodo que prueba Reflection.
        
        //Object result = Creador.invoke(operacionSeleccionada.operacion,operacionSeleccionada);
        //return new Suma(operacionSeleccionada);
        return null;
    }
}
