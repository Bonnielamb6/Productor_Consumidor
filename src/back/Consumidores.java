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
public class Consumidores extends Thread{
    boolean despierto;
    Planificador buffer;
    
    public Consumidores (Planificador temp){
        despierto = false;
        buffer = temp;
    }
    
    
    
    @Override
    public void run(){
        while (true){
            try{
                
                if(buffer.getCantidadProductos()==0){
                    dormir();
                }else{
                    despertar();
                }
                
                if(despierto){
                    buffer.consumir();
                    System.out.println("Consumio");
                    System.out.println(" " + buffer.cantidadProductos);
                }
                
                sleep((long) (Math.random() * 10000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidores.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
}
