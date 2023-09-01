/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

/**
 *
 * @author PC
 */
public class Consumidores extends Thread{
    int despierto = 0;
    
    public void consumir(){}
    
    public void despertar(){
        despierto = 1;
    }
    
    public void dormir(){
        despierto = 0;
    }
    
    
}
