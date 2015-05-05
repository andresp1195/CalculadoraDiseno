/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import calculadoradiseño.IOperacion;
import java.lang.Math.*;
import java.util.List;
/**
 *
 * @author Mauricio Gamboa
 */
    public class Radicacion implements IOperacion {
        float indice;
        int subradical;
        public Radicacion(){
            //Creador(operandos.lista);
        }
        @Override
        public void Creador(List<Integer> listaDeOperandos){
            indice = listaDeOperandos.get(0);
            subradical = listaDeOperandos.get(1);
            indice = ResultadoDeLaRadicacion((int) indice,(1/subradical));
        }
        public float ResultadoDeLaRadicacion(int indice,int subradical){
            return (float)(Math.pow(indice,(1/subradical)));
        }
    }
    
