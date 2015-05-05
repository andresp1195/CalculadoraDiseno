/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IOperacion;
import calculadoradiseño.DTO;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Resta implements IOperacion {
//    int restaTotal;
//    int elementoActualDeLaLista;
    //public DTO MiDTO;
    public int minuendo;
    public int sustraendo;
    public Resta(){
        //this.minuendo = minuendo;
        //this.sustraendo = sustraendo;
        //Calcular(minuendo,sustraendo);
    }
    
//    public void Creador (DTO listaDeOperandos){
//        int tamano = listaDeOperandos.lista.size();
//        restaTotal=listaDeOperandos.lista.get(0);
//        for (int i=1;i<tamano;i++){            
//            elementoActualDeLaLista = listaDeOperandos.lista.get(i);
//            restaTotal= ResultadoDeLaResta(restaTotal,elementoActualDeLaLista);}
//    System.out.println(restaTotal);}
    
    @Override    
    public String Calcular (int minuendo, int sustraendo){
        int resultado = (minuendo-sustraendo);
        String resultadoConvertido = String.valueOf(resultado);        
        return resultadoConvertido;
    } 

}
