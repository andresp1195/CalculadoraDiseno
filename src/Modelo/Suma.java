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
public class Suma extends Operacion {
    @Override
    public String Calcular (float sumando1, float sumando2){
        float resultado = (sumando1+sumando2);
        String resultadoConvertido = String.valueOf(resultado);
        return resultadoConvertido;        
    }

    @Override
    public boolean Validar(float x, float y) {
        return true;
    }
}