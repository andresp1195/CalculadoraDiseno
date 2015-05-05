/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import calculadoradiseño.IOperacion;
import java.lang.Math.*;
import java.util.List;
/**
 *
 * @author Mauricio Gamboa
 */
    public class Radicacion implements IOperacion {
        public float indice;
        public int subradical;
        @Override        
        public String Calcular(float indice,float subradical){
            double resultado = (Math.pow(indice,(1/subradical)));            
            String resultadoConvertido = String.valueOf(resultado);        
            return resultadoConvertido;
        }
    }
    
