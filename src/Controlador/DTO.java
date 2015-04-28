package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Mauricio Gamboa
 */
public class DTO {
    public List<Integer> lista; 
    String operacion; 
    int resultado; 
   
    
    public DTO(List<Integer> lista, String operacion, int resultado){
        this.lista=lista; 
        this.operacion=operacion; 
        this.resultado=resultado; 
    }
    
    //lista.add(numero);
    //lista.get(i);
    //lista.clear();
    //lista.size(); 
        
    
}
