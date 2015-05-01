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
public class Division extends Creador{
    int elementoActualDeLaLista;
    float cociente;
    public Division(){
        //CreadorDeLaDivision(operandos.lista);
    }
    public void CreadorDeLaDivision(List <Integer> listaDeOperandos){
        int tamano = listaDeOperandos.size(); 
        cociente = (float)listaDeOperandos.get(0);
        for (int i=1;i<tamano;i++){
            elementoActualDeLaLista = listaDeOperandos.get(i); 
            cociente = CocienteResultado(cociente,elementoActualDeLaLista);
        }
    System.out.println(cociente);}
    public float CocienteResultado(float dividendo,int divisor){
        return (dividendo/divisor);
    }
}
