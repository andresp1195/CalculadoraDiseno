/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Suma extends Operacion {
    
    int sumaTotal;
    int elementoActualDeLaLista;
    public Suma(){
     
    }
    public void CreadorDeLaSuma(List<Integer> lista){
        int tamano = lista.size();
        for (int i=0;i<tamano;i++){
            elementoActualDeLaLista = lista.get(i);
            sumaTotal= ResultadoDeLaSuma(sumaTotal,elementoActualDeLaLista);
        }
    System.out.println(sumaTotal);
    }
    public int ResultadoDeLaSuma (int sumando1, int sumando2){
        return (sumando1+sumando2);
        
        }
    }

