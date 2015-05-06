/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author Mauricio Gamboa
 */
public class Multiplicacion extends Operacion{  
    @Override    
    public String Calcular (float factor1, float factor2){
        float resultado = (factor1*factor2);
        String resultadoConvertido = String.valueOf(resultado);  
        return resultadoConvertido;
    }

    @Override
    public boolean Validar(float x, float y) {
        return true;
    }
}
