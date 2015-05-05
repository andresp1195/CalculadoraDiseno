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
    public float sumando1;
    public float sumando2;
    @Override
    public String Calcular (float sumando1, float sumando2){
        float resultado = (sumando1+sumando2);
        String resultadoConvertido = String.valueOf(resultado);
        return resultadoConvertido;        
    }
}

