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
        
         //int numero2=(int)numero;
//        String string_resultado=""; 
//        int rem; 
//        char dig[]={'0','1','2','3','4','5','6','7'};
//        while(numero>0){
//            rem=numero2%8; 
//            string_resultado=dig[rem]+string_resultado; 
//            numero=numero/8;
//    }
         String octal = Integer.toOctalString(numero);
         System.out.println("octal"+octal);
         return octal;
    }
}
