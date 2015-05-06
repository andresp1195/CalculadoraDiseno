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
public class Potencia extends Operacion {
    @Override       
    public String Calcular(float base, float exponente){       
        double resultado = (Math.pow(base,exponente));
        String resultadoConvertido = String.valueOf(resultado); 
        return resultadoConvertido;
    }

    @Override
    public boolean Validar(float x, float y) {
        if ((x==0) && (y==0)){
            return false;
        }
        else{
            return true;
        }
    }
} 
