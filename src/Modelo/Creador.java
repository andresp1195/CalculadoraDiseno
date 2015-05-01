/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Andres
 */
public abstract class Creador extends Operacion{
    
    public Creador(){}
    
    public void AsignarOperacion(String operacionSeleccionada) throws ClassNotFoundException{
    Class ClaseAsignada = Class.forName(operandos.operacion);
    
    }
}
