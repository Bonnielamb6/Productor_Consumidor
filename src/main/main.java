package main;
import back.Productores;
import back.Consumidores;
import back.Planificador;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Planificador buffer = new Planificador();
        Productores productor = new Productores(buffer);
        Consumidores consumidor = new Consumidores(buffer);
        
        consumidor.start();
        productor.start();
        
    }
    
}
