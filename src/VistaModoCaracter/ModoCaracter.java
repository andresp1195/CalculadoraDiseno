/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaModoCaracter;

import calculadoradiseño.*; 
import Controlador.*; 
import VistaModoCaracter.*; 


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
    OperacionesSistema operacion; 
    int decision; //Decision de Salida 
    Scanner buffer = new Scanner(System.in); 
    public List<OperacionesSistema> lista = new LinkedList <OperacionesSistema>(); 
    //public Operaciones op; 
    
    
  
    
    public void cargar_operaciones(List<OperacionesSistema> listaos){
        this.lista=listaos; 
        OperacionesSistema operacion1 = new OperacionesSistema("Suma",1);
        OperacionesSistema operacion2 = new OperacionesSistema("Resta",2); 
        OperacionesSistema operacion3 = new OperacionesSistema("Multiplicacion",3); 
        OperacionesSistema operacion4 = new OperacionesSistema("Division",4); 
        OperacionesSistema operacion5 = new OperacionesSistema("Potencia",5);
        OperacionesSistema operacion6 = new OperacionesSistema("Radicacion",6); 
        OperacionesSistema operacion7 = new OperacionesSistema("Cbinario",7); 
        OperacionesSistema operacion8 = new OperacionesSistema("Chexadecimal",8); 
        OperacionesSistema operacion9 = new OperacionesSistema("Coctal",9);
        lista.add(operacion1); 
        lista.add(operacion2);
        lista.add(operacion3);
        lista.add(operacion4);
        lista.add(operacion5);
        lista.add(operacion6);
        lista.add(operacion7);
        lista.add(operacion8);
        lista.add(operacion9);
   
        
        //System.out.println(lista.get(1).Nombre);
    }
    
    public OperacionesSistema obtenerOperacion(int Id){ 
        List<OperacionesSistema> ListaMSN= this.lista; 
        int tamano_lista= ListaMSN.size();
        int contador=0;
        OperacionesSistema res;
        res= ListaMSN.get(0);
        if (tamano_lista>1){
        while (contador<tamano_lista){
            if ((ListaMSN.get(contador).ID)==Id){
                res=ListaMSN.get(contador);
                //System.out.println(res.contenido);
                //ListaMSN.remove(res); 
                return res; 
            }
            else{
                contador++;
            }
        }
        if ((res.ID)==Id){
            //System.out.println(res.contenido);
            //ListaMSN.remove(res);
            return res; 
        }
        else{
            return null; 
        }
        }
        else{
            if (tamano_lista==1){
                
                if ((res.ID)==Id){
                
                res=ListaMSN.get(0);
                //System.out.println(res.contenido);
                //ListaMSN.remove(res);
                return res; 
                }
                else{
                    return null; 
                }
                
            }
            else{
                //System.out.println("error");
                return null; 
            }
        }
        
    }
    
    public void operar() throws ClassNotFoundException{ 
    cargar_operaciones(lista); 
    do {
    do { 
        
        menu_opciones();
        if (operacion.ID > lista.size() || operacion.ID < 1) { 
            System.out.println("Ingrese una opción válida."); 
        } 
    } while (operacion.ID > lista.size() || operacion.ID < 1);   
    if ((operacion.ID >= 1)&&(operacion.ID <= 5)) { 
        System.out.println("Operacion a realizar: "+operacion.Nombre);
        DTO enviar= new DTO((solicitar_numeros(2)),operacion.Nombre,"0",false,""); 
        Controlador peticion = new Controlador(enviar); 
        String resultado= peticion.MiDTO.resultado;  
    } 
    else { 
        System.out.println("Operacion a realizar: "+operacion.Nombre);
        DTO enviar= new DTO((solicitar_numeros(1)),operacion.Nombre,"0",false,""); 
        Controlador peticion = new Controlador(enviar);
        peticion.enviar_solicitud();
        String resultado= peticion.MiDTO.resultado;
    } 
    
    System.out.println("Ingrese '1' si quiere realizar otra operacion, '2' si quiere cerrar el programa"); 
    operacion.ID=0; 
    decision = buffer.nextInt(); 
    } while (decision == 1); 
    }

    
   public void menu_opciones (){
        System.out.println("        Bienvenido a la calculadora de operaciones y conversiones");
        System.out.println("--------------------------Menú de opciones---------------------------");
        imprimir_operaciones(); 
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Digite la opción deseada >>> ");
        String opcion_ingresada= buffer.nextLine();
        if ((validar_opcion(opcion_ingresada))&&(validar_intervalo_menu(opcion_ingresada))){
           operacion=  obtenerOperacion((Integer.parseInt(opcion_ingresada))); 
        }
        else{
            OperacionesSistema operacion_error = new OperacionesSistema("error",0);
            operacion=operacion_error; 
        }
        
        
   }
   
   public void imprimir_operaciones(){
       for (int i=0;i<lista.size();i++ ){
           System.out.println("Opción "+lista.get(i).ID+": "+lista.get(i).Nombre);
       }
   }
   
   public boolean validar_opcion(String valor_ingresado){
       if (EsNumero(valor_ingresado)) {
           return true; 
       }
       else{
           return false;  
       }
       
       
   }
   
   public boolean validar_intervalo_menu(String valor_ingresado){
       if (Integer.parseInt(valor_ingresado)<=lista.size() && Integer.parseInt(valor_ingresado)>=1){
           return true; 
       }
       else{
           //System.out.println("Faaaalso");
           return false; 
       }
   }
   
   public boolean validar_intervalo_enteros(String valor_ingresado){
       if (Integer.parseInt(valor_ingresado)>=0){
           return true; 
       }
       else{
           //System.out.println("Faaaalso500");
           return false; 
       }
   }
  
   
   public boolean EsNumero(String valor_recibido){
    if (valor_recibido == null)
        return false;
    if (valor_recibido.length() == 0)
        return false;
    for (int i = 0; i < valor_recibido.length(); i++)
    {
        if (!Character.isDigit(valor_recibido.charAt(i)))
            return false;
    }
    return true;
   }
   
   public List<Integer> solicitar_numeros(int cantidad_numeros){
       int cantidad_operandos=cantidad_numeros; //cambiar si se desean operar mayor cantidad de operadores. 
       List <Integer> listan = new LinkedList(); 
       int contador=0; 
       while (contador<cantidad_operandos){
           
           do {
               System.out.println((contador+1)+". Ingrese un número: >>>");
            
           //System.out.print(">>> ");
           String numero_ingresado= buffer.nextLine();
           if ((validar_opcion(numero_ingresado))&&(validar_intervalo_enteros(numero_ingresado))){
               listan.add(Integer.parseInt(numero_ingresado));
               contador++; 
           }
           
           } while (contador<cantidad_operandos);
       }
       return (listan);  
       
   }
    
}

