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
public class Binario extends Conversion{
    @Override
    public String Convertir (int decimal){
        //int numero=(int)decimal;
        String binario = Integer.toBinaryString(decimal);
        return binario; 
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
