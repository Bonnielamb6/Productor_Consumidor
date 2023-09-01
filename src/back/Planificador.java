/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

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
            
        }
    }
    
    public synchronized void producir(){
        while(!lleno){
            
        }
    }
}
