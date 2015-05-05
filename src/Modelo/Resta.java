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
public class Resta implements IOperacion {

    public float minuendo;
    public float sustraendo;
    @Override    
    public String Calcular (float minuendo, float sustraendo){
        float resultado = (minuendo-sustraendo);
        String resultadoConvertido = String.valueOf(resultado);    
        return resultadoConvertido;
    }
    @Override
    public boolean Validar(float x, float y) {
        return true;
    }
    
}
