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
    public String operacion; 
    public String resultado; 
    public String error; 
    public String mensaje_error;
    public String tipo;
    
    //List<Integer> lista, String operacion, String resultado, String mensaje_error, String tipo
    public DTO(List<Integer> parametrosOperables, List<String> parametrosNoOperables){
        //DTO.class.getFields().length
        this.lista=parametrosOperables; 
        this.operacion=parametrosNoOperables.get(0); 
        this.resultado=parametrosNoOperables.get(1);
        this.mensaje_error=parametrosNoOperables.get(2); 
        this.tipo=parametrosNoOperables.get(3);
    }
}
