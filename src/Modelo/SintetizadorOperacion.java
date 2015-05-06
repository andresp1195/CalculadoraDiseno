/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.DTO;
import calculadoradiseño.IOperacion;

/**
 *
 * @author Jespi_000
 */
public class SintetizadorOperacion {
    //Sintetiza los parámetros de la lista del DTO recibidos y les aplica la operación correspondiente
    public static DTO Efectuar(DTO Peticion, IOperacion Operacion){
        //validar que todos los parametros de la lista sean enteros positivos
        if (!(ValidarLista.Validar(Peticion.lista))){
            //Meter el error en el DTO
            Peticion.error = true;
            Peticion.mensaje_error = "Existe un operando menor que cero.";
            return Peticion;
        }
        
        float resultadoTotal;
        float elementoActualDeLaLista;
        int tamano = Peticion.lista.size();
        resultadoTotal = Peticion.lista.get(0);
        
        for (int i=1;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            if (Operacion.Validar(resultadoTotal, elementoActualDeLaLista)){
                resultadoTotal = Float.parseFloat(Operacion.Calcular(resultadoTotal, elementoActualDeLaLista));
            }
            else{
                Peticion.error = true;
                Peticion.mensaje_error = "Algún operando no cumplió con la validación correspondiente.";
                return Peticion;
            }
        }
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }
}
