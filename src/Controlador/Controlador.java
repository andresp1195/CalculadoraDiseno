/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import calculadoradiseño.DTO;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Mauricio Gamboa
 */
public class Controlador {
    //public DTO MiDTO; 
    
    public Controlador() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
    }
    
    public DTO enviar_solicitud(DTO MiDTO) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        //Reflexión para saber el tipo de la interfaz (IOperacion o IConversion, por el momento, ya que está abierto a cambios)
        Class ClaseAsignada = Class.forName("calculadoradiseño.I"+MiDTO.tipo);          
        
        //Reflexión para el creador (CreadorOperacion o CreadorConversion, abierto a extensión)
        Class ClaseCreador = Class.forName("Modelo.Creador"+MiDTO.tipo);
        Object InstanciaCreador = ClaseCreador.getConstructor().newInstance();
        
        //Métodos necesarios para obtener el resultado
        Method asignar = ClaseCreador.getMethod("Asignar", DTO.class);
        Method efectuar = ClaseCreador.getMethod("Efectuar", DTO.class, ClaseAsignada);
        
        try{
            return (DTO) efectuar.invoke(InstanciaCreador, MiDTO, (asignar.invoke(InstanciaCreador, MiDTO)));
        }
        catch(Exception e){
            MiDTO.error = true;
            MiDTO.mensaje_error = "Problema en la obtención del nombre de la operación.";
            return MiDTO;
        }
    }
    
}
