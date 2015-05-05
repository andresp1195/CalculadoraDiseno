/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import calculadoradiseño.IConversion;

/**
 *
 * @author Mauricio Gamboa
 */
public class Octal implements IConversion{
     @Override
     public String Convertir (int numero){
        
         String octal = Integer.toOctalString(numero);
         return octal;
    }
}
