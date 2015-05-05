/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.DTO;

/**
 *
 * @author Andres
 */
public abstract class Operacion{
    public String resultado;
    public void SetResultado(String resultado){
        this.resultado = resultado;
    }
}
