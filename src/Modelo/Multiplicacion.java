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
public class Multiplicacion implements IOperacion{   
    public float factor1;
    public float factor2;
    @Override    
    public String Calcular (float factor1, float factor2){
        float resultado = (factor1*factor2);
        String resultadoConvertido = String.valueOf(resultado);        
        return resultadoConvertido;
    }
}
