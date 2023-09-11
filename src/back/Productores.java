package back;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Productores extends Thread{
    boolean despierto; 
    boolean corriendo;
    Planificador buffer;
    boolean vivo;
    
    public Productores (Planificador temp){
        despierto = true;
        buffer = temp;
        corriendo = true;
        vivo = true;
    }
    
    
    @Override
    public void run(){
        
        while(vivo){
            try {
                if(buffer.getCantidadProductos()==10){
                    dormir();
                }else{
                    despertar();
                }
                if(despierto){
                    buffer.producir();
                    System.out.println("Produjo");
                }
                
                
                sleep((long) (Math.random() * 10000));

            } catch (InterruptedException ex) {
                Logger.getLogger(Productores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
        
    }
    
    public void despertar(){
        despierto = true;
    }
    
    public void dormir(){
        despierto = false;
    }

    public boolean isDespierto() {
        return despierto;
    }
    
    public void correr(){
        corriendo = true;
    }
    
    public void detener(){
        corriendo = false;
    }

    public boolean isCorriendo() {
        return corriendo;
    }
    
    public void terminarHilo(){
        vivo = false;
    }
}
