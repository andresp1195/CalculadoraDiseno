/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.DTO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Suma implements IOperacion {    
    int sumaTotal;
    int elementoActualDeLaLista; 
    public DTO MiDTO;
    public Suma(DTO dtos){ 
        this.MiDTO = dtos;
        Creador(MiDTO);
    }
    @Override
    public void Creador(DTO listaDeOperandos){
        int tamano = listaDeOperandos.lista.size();        
        sumaTotal = listaDeOperandos.lista.get(0);
        for (int i=1;i<tamano;i++){           
            elementoActualDeLaLista = listaDeOperandos.lista.get(i);
            sumaTotal = ResultadoDeLaSuma(sumaTotal,elementoActualDeLaLista);
        }    System.out.println(sumaTotal);
    }
    public int ResultadoDeLaSuma (int sumando1, int sumando2){        
        return (sumando1+sumando2);        
        }

    
    }

