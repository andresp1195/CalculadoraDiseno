/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import calculadoradiseño.DTO;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Resta implements IOperacion {
//    int restaTotal;
//    int elementoActualDeLaLista;
    //public DTO MiDTO;
    public int minuendo;
    public int sustraendo;
//    public Resta(){   
//    }   
    @Override    
    public String Calcular (int minuendo, int sustraendo){
        int resultado = (minuendo-sustraendo);
        String resultadoConvertido = String.valueOf(resultado);        
        return resultadoConvertido;
    } 

}
