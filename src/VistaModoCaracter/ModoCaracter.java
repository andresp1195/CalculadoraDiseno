/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaModoCaracter;

import calculadoradiseño.*; 
import Controlador.*; 


import java.util.Arrays; 
import java.util.Scanner; 
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Mauricio Gamboa
 */
public class ModoCaracter {
    int operacion; 
    int numero1;
    int numero2;
    int suma;
    int resta; 
    int multiplicacion; 
    int division;
    int decision; 
    Scanner buffer = new Scanner(System.in); 
    
    public void operar(){
    do {
    do { 
        System.out.print("Ingrese un opcionn");
        System.out.print("opcion 1:Suma"); 
        System.out.print("opcion 2:Resta"); 
        System.out.print("opcion 3:Multiplicacion"); 
        System.out.print("opcion 4ivision"); 
        operacion = buffer.nextInt(); 
        if (operacion > 4 || operacion < 1) { 
            System.out.println("Ingrese una opcion valida"); 
        } 
    } while (operacion > 4 || operacion < 1);   
    if (operacion == 1) { 
        System.out.println("1.Ingrese numero:"); 
        numero1 = buffer.nextInt();
        System.out.println("2. Ingrese otro numero:"); 
        numero2 = buffer.nextInt(); 
        
        List <Integer> lista = new LinkedList(); 
        lista.add(numero1); 
        lista.add(numero2); 
       
        DTO enviar= new DTO(lista,"suma","0",false,""); 
        //Aquí debe ser a la interfaz
        Controlador peticion = new Controlador(enviar); 
        String resultado= peticion.MiDTO.resultado;  
        
    } 
    if (operacion == 2) { 
        System.out.println("la resta es de:" + resta); 
    } 
    if (operacion == 3) { 
       System.out.println("la multipliacion es de:" + multiplicacion); 
    } 
    if (operacion == 4) { 
        System.out.println("la division es de:" + division); 
    } 
    System.out.println("ingrese '1' si quiere realizar otra operacion, '2' si quiere cerrar el programa"); 
    decision = buffer.nextInt(); 
} while (decision == 1); 
    }

    
}

