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
public class Octal extends Conversion{
     @Override
     public String Convertir (int numero){
        
         String octal = Integer.toOctalString(numero);
         return octal;
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
