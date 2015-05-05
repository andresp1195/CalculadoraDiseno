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
public class Chexadecimal {
      
    public String Convertir (float decimal){
        int numero=(int)decimal;
        String hexadecimal = Integer.toHexString(numero);
        return hexadecimal; 
    }
}
