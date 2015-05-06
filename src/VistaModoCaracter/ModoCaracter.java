package VistaModoCaracter;

import calculadoradiseño.DTO;
import Controlador.*; 
import calculadoradiseño.IVistaControlador;
import java.util.Scanner; 
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio Gamboa
 */
public class ModoCaracter implements IVistaControlador {
    OperacionesSistema operacion; 
    String decision; //Decision de Salida del sistema.  "1" para continuar, cualquier otra tecla para salir. 
    Scanner buffer = new Scanner(System.in); 
    public int cantidad_operandos=2; 
    public int cantidad_a_convertir =1; 
    public List<OperacionesSistema> lista = new LinkedList <OperacionesSistema>(); 
    
    //Carga las operaciones de la calculadora al sistema. 
    public void cargar_operaciones(List<OperacionesSistema> listaos){
        this.lista=listaos; 
         
        OperacionesSistema operacion1 = new OperacionesSistema("Suma",lista.size()+1,"Operacion");
        lista.add(operacion1);
        OperacionesSistema operacion2 = new OperacionesSistema("Resta",lista.size()+1,"Operacion");
        lista.add(operacion2);
        OperacionesSistema operacion3 = new OperacionesSistema("Multiplicacion",lista.size()+1,"Operacion");
        lista.add(operacion3);
        OperacionesSistema operacion4 = new OperacionesSistema("Division",lista.size()+1,"Operacion"); 
        lista.add(operacion4);
        OperacionesSistema operacion5 = new OperacionesSistema("Potencia",lista.size()+1,"Operacion");
        lista.add(operacion5);
        OperacionesSistema operacion6 = new OperacionesSistema("Radicacion",lista.size()+1,"Operacion"); 
        lista.add(operacion6);
        OperacionesSistema operacion7 = new OperacionesSistema("Binario",lista.size()+1,"Conversion"); 
        lista.add(operacion7);
        OperacionesSistema operacion8 = new OperacionesSistema("Hexadecimal",lista.size()+1,"Conversion"); 
        lista.add(operacion8);
        OperacionesSistema operacion9 = new OperacionesSistema("Octal",lista.size()+1,"Conversion");
        lista.add(operacion9);
    }
    
    //Devuelve las operaciones cargadas en la calculado. 
    public OperacionesSistema obtenerOperacion(int Id){ 
        List<OperacionesSistema> Lista_Operaciones= this.lista; 
        int tamano_lista= Lista_Operaciones.size();
        int contador=0;
        OperacionesSistema operacion;
        operacion= Lista_Operaciones.get(0);
        if (tamano_lista>1){
        while (contador<tamano_lista){
            if ((Lista_Operaciones.get(contador).ID)==Id){
                operacion=Lista_Operaciones.get(contador);
                return operacion; 
            }
            else{
                contador++;
            }
        }
        if ((operacion.ID)==Id){
            return operacion; 
        }
        else{
            return null; 
        }
        }
        else{
            if (tamano_lista==1){ 
                if ((operacion.ID)==Id){ 
                operacion=Lista_Operaciones.get(0);
                return operacion; 
                }
                else{
                    return null; 
                }
            }
            else{
                return null; 
            }
        }
    }
    
    //Método principal de la vista modo caracter. 
    public void operar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{ 
    cargar_operaciones(lista); 
    System.out.println("        Bienvenido a la calculadora de operaciones y conversiones");
    do {
    do { 
        
        menu_opciones();
        if (operacion.ID > lista.size() || operacion.ID < 1) { 
            System.out.println("Ingrese una opción válida."); 
        } 
    } while (operacion.ID > lista.size() || operacion.ID < 1);   
    if ((operacion.Tipo.equalsIgnoreCase("operacion"))&&!(operacion.Nombre.equalsIgnoreCase("radicacion"))) { 
        System.out.println("--> Operacion a realizar: "+operacion.Nombre);
        DTO peticion= new DTO((solicitar_numeros(cantidad_operandos)),operacion.Nombre,"0",false,"",operacion.Tipo);         
        EnviarSolicitud(peticion);
    } 
    else if ((operacion.Nombre.equalsIgnoreCase("radicacion"))) { 
        System.out.println("--> Operacion a realizar: "+operacion.Nombre);
        List<Integer> lista = solicitar_numeros(cantidad_a_convertir); 
        lista.add(2);
        DTO peticion= new DTO(lista,operacion.Nombre,"0",false,"",operacion.Tipo);         
        EnviarSolicitud(peticion);
    }
    else { 
        System.out.println("--> Operacion a realizar: "+operacion.Nombre);
        DTO peticion= new DTO((solicitar_numeros(cantidad_a_convertir)),operacion.Nombre,"0",false,"",operacion.Tipo); 
        EnviarSolicitud(peticion);
    } 
    System.out.println("Ingrese '1' para realizar otra operacion o cualquier número para salir del sistema."); 
    //operacion.ID=0;
    //decision = buffer.nextInt(); 
    decision= buffer.nextLine();
    } while (decision.equalsIgnoreCase("1")); 
    }
    
    @Override
    public void EnviarSolicitud(DTO solicitud) {
        Controlador controlador;
        try {
            controlador = new Controlador();
            DTO dtoRespuesta = controlador.enviar_solicitud(solicitud);
            if (dtoRespuesta.error){
                System.out.println("Error del sistema: "+dtoRespuesta.mensaje_error);
            }
            else{
                System.out.println("--> Resultado: "+dtoRespuesta.resultado);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ModoCaracter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
   public void menu_opciones (){
        
        System.out.println("--------------------------Menú de opciones---------------------------");
        imprimir_operaciones(); 
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Digite la opción deseada. >>> ");
        String opcion_ingresada= buffer.nextLine();
        if ((EsNumero(opcion_ingresada))&&(validar_intervalo_menu(opcion_ingresada))){
           operacion=  obtenerOperacion((Integer.parseInt(opcion_ingresada))); 
        }
        else{
            OperacionesSistema operacion_error = new OperacionesSistema("error",0,"error");
            operacion=operacion_error; 
        }
   }
   
   //Imprime las operaciones y conversiones del sistema. 
   public void imprimir_operaciones(){
       for (int i=0;i<lista.size();i++ ){
           System.out.println("--> Opción "+lista.get(i).ID+": "+lista.get(i).Nombre);
       }
   }
   
   
   //Valida que la opción ingresada por el usuario esté dentro del intervalo de operaciones permitidas por el sistema. 
   public boolean validar_intervalo_menu(String valor_ingresado){
       if (Integer.parseInt(valor_ingresado)<=lista.size() && Integer.parseInt(valor_ingresado)>=1){
           return true; 
       }
       else{
           return false; 
       }
   }
   
   //Verifica que el valor ingresado por el usuario sea un entero positivo. 
   public boolean validar_intervalo_enteros(String valor_ingresado){
       if (Integer.parseInt(valor_ingresado)>=0){
           return true; 
       }
       else{
           return false; 
       }
   }
  
   
   //Valida si el string ingresado es un entero.
   public boolean EsNumero(String valor_recibido){
    if (valor_recibido == null)
        return false;
    if (valor_recibido.length() == 0)
        return false;
    for (int i = 0; i < valor_recibido.length(); i++)
    {
        if (!Character.isDigit(valor_recibido.charAt(i))){
            System.out.println("-->Debe ingresar números enteros positivos. ");
            return false;}
    }
    return true;
   }
   
   
   //Solicita la cantidad de numeros a operar por la calculadora
   public List<Integer> solicitar_numeros(int cantidad_numeros){
       int cantidad_operandos=cantidad_numeros;  
       List <Integer> listan = new LinkedList(); 
       int contador=0; 
       while (contador<cantidad_operandos){
           
           do {
               System.out.print((contador+1)+". Ingrese un número: >>> ");
            
           
           String numero_ingresado= buffer.nextLine();
           if ((EsNumero(numero_ingresado))&&(validar_intervalo_enteros(numero_ingresado))){
               listan.add(Integer.parseInt(numero_ingresado));
               contador++; 
           }
           
           } while (contador<cantidad_operandos);
       }
       return (listan);  
       
   }
    
}