package back;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Productores extends Thread{
    int despierto = 0; //0 significa que esta dormido, 1 que esta despierto
    
    
    
    public void producir(){
        
    }
    
    public void despertar(){
        despierto = 1;
    }
    
    public void dormir(){
        despierto = 0;
    }
    
    
}
