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
public class Resta extends Creador{
    int restaTotal;
    int elementoActualDeLaLista;
    public Resta(){
        CreadorDeLaResta(operandos.lista);
    }
    public void CreadorDeLaResta (List<Integer> listaDeOperandos){
        int tamano = listaDeOperandos.size();
        for (int i=0;i<tamano;i++){
            elementoActualDeLaLista = listaDeOperandos.get(i);
            restaTotal= ResultadoDeLaResta(restaTotal,elementoActualDeLaLista);}
    }
        
    public int ResultadoDeLaResta (int minuendo, int sustraendo){
        return (minuendo-sustraendo);
    } 
    
 
}
