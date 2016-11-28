/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Perceptron {
    
    //entradas
    private ArrayList<Patron> entradas;
    private double[]pesos;
    private double acumulado;
    private double umbral;
    // entrenamiento
    private double alpha;

    public Perceptron(ArrayList<Patron> entradas, double umbral,
            double alpha) {
        this.entradas = entradas;
        this.alpha = alpha;
        this.umbral = umbral;               
    }
       
    public void entrenar (){
        
        int contadorIgualdades =0;
        while(contadorIgualdades<this.entradas.size()){
            // verificar la igualdad
            
        
        }
    
    }
    public int clasifica (Patron p){
        return getActivacion(p);
    }
    
    public int getActivacion(Patron p){
        this.acumulado = 0;
        // recorrer las entradas 
        
          double vector[]= p.getVector();
          // generar el acumulado
           for(int x=0; x < vector.length;x++){
             this.acumulado += (vector[x]*this.pesos[x]);
           }
        
        
        // inferimos la activacion o no
        if (acumulado>=this.umbral){
            return 1;}else{return 0;}
        
    
    }
    
    
}
