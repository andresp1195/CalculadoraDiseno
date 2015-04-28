package calculadoradiseño;

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
    boolean error; 
    String mensaje_error; 
    
    public DTO(List<Integer> lista, String operacion, int resultado, boolean error, String mensaje_error){
        this.lista=lista; 
        this.operacion=operacion; 
        this.resultado=resultado; 
        this.error=error; 
        this.mensaje_error=mensaje_error; 
    }
    
    //lista.add(numero);
    //lista.get(i);
    //lista.clear();
    //lista.size(); 
        
    
}
