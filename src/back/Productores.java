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
    Planificador buffer;
    
    public Productores (Planificador temp){
        despierto = false;
        buffer = temp;
    }
    
    
    public void producir(){
        while(despierto){
            try {
                buffer.producir();
                System.out.println("Produjo");
                sleep(6000);
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
    
    
}
