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
public class Hexadecimal extends Conversion{
      
    @Override
    public String Convertir (int decimal){
        //int numero=(int)decimal;
        String hexadecimal = Integer.toHexString(decimal);
        return hexadecimal.toUpperCase(); 
    }

    @Override
    public boolean Validar(int x) {
        if (x < 0){
            return false;
        }
        else{
            return true;
        }
    }
}
