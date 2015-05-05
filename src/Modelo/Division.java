/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import calculadoradiseño.IOperacion;
import java.util.List;
/**
 *
 * @author Mauricio Gamboa
 */
public class Division implements IOperacion{
    public float divisor;
    public float dividendo;    
    @Override
    public String Calcular(float dividendo,float divisor){
//        while (divisor!=0){
            float resultado = (dividendo/divisor);
            String resultadoConvertido = String.valueOf(resultado);
            return resultadoConvertido;}
//        return "true";
    }
//}
