/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Suma extends Creador {    
    int sumaTotal;
    int elementoActualDeLaLista;
    public Suma(){              
        CreadorDeLaSuma(operandos.lista);
    }
    public void CreadorDeLaSuma(List<Integer> listaDeOperandos){
        int tamano = listaDeOperandos.size();
        for (int i=0;i<tamano;i++){
            elementoActualDeLaLista = listaDeOperandos.get(i);
            sumaTotal= ResultadoDeLaSuma(sumaTotal,elementoActualDeLaLista);
        }    
    }
    public int ResultadoDeLaSuma (int sumando1, int sumando2){
        return (sumando1+sumando2);
        
        }
    }

