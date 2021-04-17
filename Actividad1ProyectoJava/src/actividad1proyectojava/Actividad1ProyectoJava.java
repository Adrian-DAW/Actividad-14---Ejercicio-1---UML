/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1proyectojava;

/**
 *
 * @author Adrian Santana
 * 
 * PROGRAMA ENCARGADO DE IMPRIMIR LA ALTURA, EL COLOR, EL RADIO,
 * EL CENTROX Y EL CENTROY DE UN CONO
 * 
 */
public class Actividad1ProyectoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    float altura = (float)(Math.random() * 10) + 1; 
    String color = "Azul";
    float radio = (float)(Math.random() * 10) + 1;
    float CentroX = (float)(Math.random() * 10) + 1;
    float CentroY = (float)(Math.random() * 10) + 1;
    
    Cono cono1 = new Cono();
    
    cono1.setAltura(altura);
    cono1.setColor( color);
    cono1.setRadio(radio);
    cono1.setCentroX(CentroX);
    cono1.setCentroY(CentroY);
    
    cono1.imprimir();
    
    
    
    
    
    
        
        
    }
    
}
