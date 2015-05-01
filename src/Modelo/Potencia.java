/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;
import java.util.List;
import java.lang.Math.*;
import Modelo.Multiplicacion;

/**
 *
 * @author Mauricio Gamboa
 */
public class Potencia extends Creador {
    int elementoActualDeLaLista;
    double potenciaTotal;
    int potenciaAcumulada;
    public Potencia(){
        
        CreadorDeLaPotencia(operandos.lista);
    }
    public void CreadorDeLaPotencia(List<Integer> listaDeOperandos){
        Multiplicacion multiplicarExponentes = new Multiplicacion();
        int exponente = 1;
        int base = listaDeOperandos.get(0); 
        int tamano = listaDeOperandos.size();
        for (int i=1;i<tamano;i++){
            //exponente = multiplicarExponentes.ResultadoDeLaMultiplicacion(exponente,listaDeOperandos.get(i));
            potenciaTotal=ResultadoDeLaPotencia(base,exponente);}
    }
    
    public double ResultadoDeLaPotencia(int base, int exponente){
        return (Math.pow(base, exponente));
    }
}
