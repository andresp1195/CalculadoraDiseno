/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradiseño;
import Modelo.Suma;
import VistaModoCaracter.ModoCaracter; 
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Andres
 */
public class CalculadoraDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // TODO code application logic here
        //ModoCaracter mc= new ModoCaracter();
        //mc.operar(); 
         // TODO code application logic here
        List<Integer> operandos = new LinkedList();
        operandos.add(2);
        operandos.add(3);
        operandos.add(1);
        operandos.add(3);
        Suma suma = new Suma();
        //suma.ObtenerValoresDeLaSuma(operandos);
        //Class<?> c = suma.getClass();
//        System.out.println("getClass()"+c);
//        System.out.println("getName()"+c.getName());  
        Class cl= Class.forName("Modelo.Suma");
        //Object a = cl.newInstance();
        
        //System.out.println(a);
        //Object a = (Object)cl.newInstance();        
        //Suma a = (Suma)cl.newInstance();
        //a.CreadorDeLaSuma(operandos);
        
        
        
//        Object o = cl.newInstance();
//        System.out.println();        
        //int resultado = c1.CreadorDeLaSuma(operandos);
        //System.out.println("forName()"+Suma.forName("Suma"));   nn  

    }
    
}
