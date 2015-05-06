/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.DTO;
import calculadoradiseño.IConversion;

/**
 *
 * @author Jespi_000
 */
public class SintetizadorConversion{
    //Sintetiza los parámetros de la lista del DTO recibidos y les aplica la conversión correspondiente
    public static DTO Efectuar(DTO Peticion, IConversion Conversion){
        String resultadoTotal = "";
        int elementoActualDeLaLista;
        int tamano = Peticion.lista.size();    
        for (int i=0;i<tamano;i++){            
            elementoActualDeLaLista = Peticion.lista.get(i);
            if (!(Conversion.Validar(Peticion.lista.get(i)))){
                Peticion.error = true;
                Peticion.mensaje_error = "Algún operando no cumplió con la validación correspondiente.";
                return Peticion;
            }
            resultadoTotal = Conversion.Convertir(elementoActualDeLaLista);
        }
        Peticion.resultado = String.valueOf(resultadoTotal);
        return Peticion;
    }
}
