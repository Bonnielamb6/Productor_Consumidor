/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Planificador {
    int cantidadProductos;
    int[] productos = new int [10]; //si el valor dentro del arreglo es un 0 entonces no hay producto, si es un 1, si tiene producto
    boolean vacio;
    boolean lleno;
    
    public Planificador(){
        cantidadProductos = 0;
        vacio = true;
        lleno = false;
        inicializarArreglo();
    }
    
    public void inicializarArreglo(){
        for(int i = 0; i<10 ; i++ ){
            productos[i] = 0;
        }
    }
    
    public int estaVacio(){ //verifica si esta vacio el almacen
        if(cantidadProductos == 0){
            vacio = true;
            return 1;
        }else{
            vacio = false;
            return 0;
        }
    }
    
    public int estaLleno(){ //verifica si esta lleno el almacen
        if(cantidadProductos == 10){
            lleno = true;
            return 1;
        }
        else{
            lleno = false;
            return 0;
        }
    }
    
    public synchronized void consumir(){
        while(!vacio){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Planificador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        productos[cantidadProductos] = 0;
        cantidadProductos--;
        estaVacio();
        notifyAll();
    }
    
    public synchronized void producir(){
        while(!lleno){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Planificador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            productos[cantidadProductos++] = 1;
            cantidadProductos++;
            estaLleno();
            notifyAll();
        }
    }
}
