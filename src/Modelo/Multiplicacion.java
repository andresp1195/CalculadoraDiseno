/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import calculadoradiseño.IOperacion;
import java.util.List;

/**
 *
 * @author Mauricio Gamboa
 */
public class Multiplicacion implements IOperacion{
    int elementoActualDeLaLista;
    int producto=1;
    public Multiplicacion(){
        //Creador(operandos.lista);
    }
    @Override
    public void Creador(List<Integer> listaDeOperandos){
        int tamano = listaDeOperandos.size();
        for (int i=0;i<tamano;i++){
            elementoActualDeLaLista = listaDeOperandos.get(i);
            producto = ResultadoDeLaMultiplicacion(producto,elementoActualDeLaLista);
        }
    }
    public int ResultadoDeLaMultiplicacion (int factor1, int factor2){
        return (factor1*factor2);
    }
}
