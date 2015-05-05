/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import calculadoradiseño.DTO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Suma implements IOperacion {    
//    public Suma(){ 
//    }
    @Override
    public String Calcular (int sumando1, int sumando2){
        int resultado = (sumando1+sumando2);
        String resultadoConvertido = String.valueOf(resultado);
        return resultadoConvertido;        
    }
}

