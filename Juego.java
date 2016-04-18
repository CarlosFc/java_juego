/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author CarlosF
 */
import java.util.Random;
import java.util.Scanner;
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero, aleatorio;
        numero = 0;
        System.out.println("Adivine un número entre 0 y 9: ");
        
        Random entradaleatorio = new Random();
        entradaleatorio.nextInt();
        aleatorio = (int)(Math.random()*9 + 0);
        
       
       while(numero!=aleatorio){
            
           Scanner entradanum = new Scanner(System.in);
           numero = entradanum.nextInt();
        
           if(numero<aleatorio){
                System.out.println("Debe ser mayor");
                 
             }
             
           if(numero>aleatorio){
               System.out.println("Debe ser menor");
           }
       }
       
      
         if(numero==aleatorio){
            
            System.out.println("Le atinaste");
            
        }
        
         
        System.out.println("El número del random: " + aleatorio);
            
        
        
        
    }
    
}
