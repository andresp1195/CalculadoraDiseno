/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.DTO;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Resta implements IOperacion{
    int restaTotal;
    int elementoActualDeLaLista;
    public DTO MiDTO;
    public Resta(DTO dtos){
        this.MiDTO = dtos;
        Creador(MiDTO);
    }
    @Override
    public void Creador (DTO listaDeOperandos){
        int tamano = listaDeOperandos.lista.size();
        restaTotal=listaDeOperandos.lista.get(0);
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = listaDeOperandos.lista.get(i);
            restaTotal= ResultadoDeLaResta(restaTotal,elementoActualDeLaLista);}
    System.out.println(restaTotal);}
        
    public int ResultadoDeLaResta (int minuendo, int sustraendo){
        return (minuendo-sustraendo);
    } 
    
 
}
