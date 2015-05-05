/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import calculadoradiseño.IOperacion;
import calculadoradiseño.DTO;
import calculadoradiseño.*; 
import Modelo.*; 
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Mauricio Gamboa
 */
public class Controlador {
    public DTO MiDTO; 
    
    public Controlador(DTO MiDTO) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        this.MiDTO=MiDTO;         
        enviar_solicitud(MiDTO);
        
    }
    
    public static DTO enviar_solicitud(DTO MiDTO) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = MiDTO.lista.size();
        resultadoTotal = MiDTO.lista.get(0);
        
        IOperacion operacion = Creador.AsignarOperacion(MiDTO);
        
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = MiDTO.lista.get(i);
            resultadoTotal = Float.parseFloat(operacion.Calcular(resultadoTotal, elementoActualDeLaLista));
        }
        
        MiDTO.resultado = String.valueOf(resultadoTotal);
        
        return MiDTO;
        
        
    }
    
//    public void main(String[] args){
//        Creador m = new Creador();
//        IOperacion operacion1 = Creador.AsignarOperacion(MiDTO);
//        operacion1.Creador(MiDTO);
//        
//    }
}
