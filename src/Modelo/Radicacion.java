/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import calculadoradiseño.IOperacion;
/**
 *
 * @author Mauricio Gamboa
 */
    public class Radicacion implements IOperacion {
        public float indice;
        public int subradical;
        @Override        
        public String Calcular(float subradical,float indice){            
            double resultado = (Math.pow(subradical,(1/indice)));            
            String resultadoConvertido = String.valueOf(resultado);   
            return resultadoConvertido;
        }

    @Override
    public boolean Validar(float x, float y) {
        if (y < 1){
            return false;
        }
        else{
            return true;
        }
    }
}
    
