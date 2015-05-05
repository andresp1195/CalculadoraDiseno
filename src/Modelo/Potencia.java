/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import java.util.LinkedList;
import java.util.List;
import java.lang.Math.*;
import Modelo.Multiplicacion;
/**
 *
 * @author Mauricio Gamboa
 */
public class Potencia implements IOperacion {
    public float base;
    public float exponente;
    @Override       
    public String Calcular(float base, float exponente){       
        double resultado = (Math.pow(base,exponente));
        String resultadoConvertido = String.valueOf(resultado); 
        return resultadoConvertido;
    }
} 
